package com.singlylinkedlist;

public class Node {
    public int data;
    public Node next; // self referential class

    public void displayNode(){
        System.out.println("{ " + data + " }");
    }
}
