package com.doublylinkedlist;

public class StackDLL {
    private int size;
    private int cnt;
    private DoublyLinkedList stackList;
    public StackDLL(int maxSize){
        cnt = 0;
        size = maxSize;
        stackList = new DoublyLinkedList();
    }

    public void push(int val){
        if (isFull()){
            System.out.println("Stack is Full!");
            return;
        }
        stackList.insertLast(val);
        cnt ++;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }
        Node n = stackList.deleteLast();
        cnt --;
        return n.data;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }else {
            Node n = stackList.deleteLast();
            stackList.insertLast(n.data);
            return n.data;
        }
    }
    public boolean isFull(){
        return cnt == size;
    }

    public boolean isEmpty(){
        return cnt == 0;
    }
}
