import javax.sound.midi.*;

public class MiniMusicApp {
    public void play(){
        try {
//            MidiEvent testMidiEvent = new MidiEvent("hello", 100);
//            Sequencer player = MidiSystem.getSequencer();
//            Sequence seq = player.getSequence();
//            Track t = seq.createTrack();
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track t = seq.createTrack();
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 50, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            t.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128, 1, 50, 100);
            MidiEvent noteOff = new MidiEvent(b, 1);
            t.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        MiniMusicApp mini = new MiniMusicApp();
        mini.play();
    }
}
