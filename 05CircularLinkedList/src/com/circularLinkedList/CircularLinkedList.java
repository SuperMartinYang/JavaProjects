package com.circularLinkedList;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }

    public int deleteFirst(){
        int tmp = first.data;
        if (first.next == null)
            last = null;
        first = first.next;
        return tmp;
    }

    public void insertLast(int val){
        Node newNode = new Node();
        newNode.data = val;
        if (isEmpty())
            first = newNode;
        else{
            last.next = newNode;
            last = newNode;
        }
    }

    public void insertFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        if (isEmpty())
            last = newNode;
        newNode.next = first;
        first = newNode;
    }

    public void insertLastOld(int val){
        Node cur = first;
        while (cur.next != null){
            cur = cur.next;
        }
        Node newLast = new Node();
        newLast.data = val;
        cur.next = newLast;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void displayNodes(){
        Node cur = first;
        while (cur != null){
            cur.displayNode();
            cur = cur.next;
        }
    }
}