package com.singlylinkedlist;
// Single dimensional
// A particular node can only know its next node
// It cannot go backwards

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList(){
    }

    public Node deleteFirst(){
        Node tmp = first;
        first = first.next;
        return tmp;
    }

    public void insertFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int val){
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
}
