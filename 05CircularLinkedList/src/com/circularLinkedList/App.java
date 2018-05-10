package com.circularLinkedList;

public class App {
    public static void main(String[] args){
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(4444);
        myList.insertFirst(99);
        myList.deleteFirst();
        myList.insertFirst(88);
        myList.insertLast(999999);
        myList.displayNodes();
    }
}
