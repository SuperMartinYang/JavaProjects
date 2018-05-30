package com.musicapp;

import javax.sound.midi.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class App{
    /**
     * Swing
     * 1. create window
     * 2. create component
     * 3. add component to window
     * 4. present component
     *
     * Socket
     * 1. new Socket
     * 2. getInputStream / getOutputStream
     * 3. new BufferReader
     * 4. readLine / println
     */
    JPanel mainPanel;
    ArrayList<JCheckBox> checkBoxes;
    JFrame theFrame;
    JList incomingList;
    JTextField userMessage;
    Vector<String> listVector = new Vector<>();
    String username;
    ObjectOutputStream out;
    ObjectInputStream in;
    int nextNum = 0;
    HashMap<String, boolean[]> otherSeqsMap = new HashMap<>();

    Sequencer sequencer;
    Sequence sequence;
    Sequencer mySequencer = null;

    Track track;

    String[] instrumentName = {
            "Bass Drum", "Closed Hi-Hat", "Open Hi-Hat",
            "Acoustic Snare", "Crash Cymbal", "Hand Clap",
            "High Tom", "Hi Bongo", "Maracas",
            "Whistle", "Low Conga", "Cowbell",
            "Vibraslap", "Low-mid Tom", "High Agogo",
            "Open Hi Conga"
    };

    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};


    
    public static void main(String[] args){
        new App().startUp(args[0]); // arg 0 -> username
    }

    public void startUp(String name){
        username = name;
        try {
            Socket sock = new Socket("127.0.0.1", 4242);
            out = new ObjectOutputStream(sock.getOutputStream());
            in = new ObjectInputStream(sock.getInputStream());
            Thread remote = new Thread(new RemoteReader());
            remote.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        setUpMidi();
        buildGUI();
    }
    private void buildGUI() {
        theFrame = new JFrame("Martin Cyber BeatBox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);

        // Empty border
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        checkBoxes = new ArrayList<>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("START");
        start.addActionListener(new StartListener());
        buttonBox.add(start);

        JButton stop = new JButton("STOP");
        stop.addActionListener(new StopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("TEMPO UP");
        upTempo.addActionListener(new UpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("TEMPO DOWN");
        downTempo.addActionListener(new DownTempoListener());
        buttonBox.add(downTempo);

        JButton restoreMine = new JButton("RESTORE MINE");
        restoreMine.addActionListener(new PlayMineListener());
        buttonBox.add(restoreMine);

        JButton sendIt = new JButton("SEND IT");
        sendIt.addActionListener(new SendItListener());
        buttonBox.add(sendIt);

        userMessage = new JTextField();
        buttonBox.add(userMessage);

        incomingList = new JList();
        incomingList.addListSelectionListener(new MyListSelectionListener());
        incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane theList = new JScrollPane(incomingList);
        buttonBox.add(theList);
        incomingList.setListData(listVector);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < instrumentName.length; i ++){
            nameBox.add(new Label(instrumentName[i]));
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);
        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);

        // 2 layer panel, checkBoxes is on the top of background
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 256; i ++){
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkBoxes.add(c);
            mainPanel.add(c);
        }

        theFrame.setBounds(50, 50, 300, 300);
        theFrame.pack();
        theFrame.setVisible(true);
    }

    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }


    private void buildTrackAndStart() {
        int[] trackList = null; // hold the instruments for each pat
        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 16; i ++){
            trackList = new int[16];
            int key = instruments[i];
            for (int j = 0; j < 16; j ++){
                JCheckBox jc = checkBoxes.get(j + 16 * i);
                if (jc.isSelected()){
                    trackList[j] = key;
                }else {
                    trackList[j] = 0;
                }
            }
            makeTracks(trackList);
            track.add(makeEvent(176, 1, 127, 0, 16));
        }
        track.add(makeEvent(192, 9, 1, 0, 15));

        // loop play
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }


    private void makeTracks(int[] trackList) {
        for (int i = 0; i < 16; i ++){
            int key = trackList[i];
            if (key != 0){
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i + 1));
            }
        }
    }

    private MidiEvent makeEvent(int i, int i1, int i2, int i3, int i4) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(i, i1, i2, i3);
            event = new MidiEvent(a, i4);

        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        return event;
    }

    // Listeners
    private class StartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buildTrackAndStart();
        }
    }

    private class StopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.stop();
        }
    }

    private class DownTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * 1.03));
        }
    }

    private class UpTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * .97));
        }
    }

    private class SendItListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // store the state of checkBoxes
            boolean[] checkBoxState = new boolean[256];
            for (int i = 0; i < 256; i ++){
                JCheckBox check = checkBoxes.get(i);
                checkBoxState[i] = check.isSelected();
            }

//            String messageToSend = null;
            try {
                out.writeObject(username + nextNum++ + ": " + userMessage.getText());
                out.writeObject(checkBoxState);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            userMessage.setText("");
        }
    }

    private class MyListSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()){
                String selected = (String) incomingList.getSelectedValue();
                if (selected != null){
                    // go to the map, and change the sequence
                    boolean[] selectedState = otherSeqsMap.get(selected);
                    changeSequence(selectedState);
                    sequencer.stop();
                    mySequencer = sequencer;
                    buildTrackAndStart();
                }
            }
        }
    }

    private class PlayMineListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (mySequencer != null){
                sequencer = mySequencer;
                sequencer.start();
            }
        }
    }

    private class RemoteReader implements Runnable {

        boolean[] checkboxState = null;
        String nameToShow = null;
        Object obj = null;
        @Override
        public void run() {
            try {
                while((obj = in.readObject()) != null){
                    System.out.println("Got an object from server");
                    System.out.println(obj.getClass());
                    nameToShow = (String) obj;
                    checkboxState = (boolean[]) in.readObject();
                    otherSeqsMap.put(nameToShow, checkboxState);
                    listVector.add(nameToShow);
                    incomingList.setListData(listVector);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void changeSequence(boolean[] checkBoxState){
        for (int i = 0; i < 256; i ++){
            JCheckBox check = checkBoxes.get(i);
            check.setSelected(checkBoxState[i]);
        }
    }

}
