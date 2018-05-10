package com.doublylinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String [] args){
//        DoublyLinkedList theList = new DoublyLinkedList();
//        theList.insertFirst(22);
//        theList.insertFirst(44);
//        theList.insertFirst(66);
//        theList.insertLast(11);
//        theList.insertLast(33);
//        theList.insertLast(55);
//
//        theList.displayBackward();
//        theList.displayForward();
//
//        theList.deleteFirst();
//        theList.deleteLast();
//
//        theList.displayForward();
//        theList.insertAfter(22,77);
//        theList.insertAfter(33,88);
//        theList.displayForward();


        StackDLL sd = new StackDLL(5);
        sd.push(22);
        sd.push(44);
        sd.push(66);
        sd.pop();
        sd.push(55);
        System.out.println("Display Stack:");
        while (!sd.isEmpty()){
            System.out.println(sd.pop() + "\t");
        }
        System.out.println();
        QueueDLL qd = new QueueDLL(3);
        qd.add(22);
        qd.add(44);
        qd.add(66);
        qd.remove();
        qd.add(55);
        System.out.println("Display Queue:");
        while (!qd.isEmpty()){
            System.out.println(qd.remove() + "\t");
        }
        System.out.println();

        System.out.println("Display nQueen:");
        List<List<char[]>> res = nQueen(7);

        for (int i = 0; i < res.size(); i ++){
            for (int j = 0; j < res.get(i).size(); j++){
                for (int k = 0; k < res.get(i).get(j).length; k++){
                    char tmpChar = res.get(i).get(j)[k] == '\0' ? '.' : 'Q';
                    System.out.print(tmpChar + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static List<List<char[]>> nQueen(int n){
        List<List<char[]>> list = new ArrayList<>();
        int [][] mask = new int[n][n];
        backtracking(list, new ArrayList<char[]>(), mask, 0);
        return list;
    }

    public static void backtracking(List<List<char[]>> list, List<char[]> tmp, int[][] mask, int line){
        if (line == mask.length){
            List<char[]> newTmp = new ArrayList<>();
            for (int i = 0; i < tmp.size(); i ++){
                newTmp.add(Arrays.copyOf(tmp.get(i), tmp.get(i).length));
            }
            list.add(newTmp);
            return;
        }
        for (int i = 0; i < mask.length; i ++){
            if (mask[line][i] > 0){
                continue;
            }
            char[] tArr = new char[mask.length];
            setMask(mask, line, i, 1);
            tArr[i] = '*';
            tmp.add(tArr);
            backtracking(list, tmp, mask, line + 1);
            tArr[i] = '\0';
            tmp.remove(tmp.size() - 1);
            setMask(mask, line, i, -1);
        }
    }

    public static void setMask(int [][] mask, int row, int col, int changeNum){
        for (int i = 0; i < mask.length - row; i++){
            if (col + i < mask.length)
                mask[row + i][col + i] += changeNum;
            mask[row + i][col] += changeNum;
            if (col - i >= 0)
                mask[row + i][col - i] += changeNum;
        }
    }
}
