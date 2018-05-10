package com.doublylinkedlist;

public class QueueDLL {
    private int size;
    private int cnt;
    private DoublyLinkedList queueList;
    public QueueDLL(int maxSize){
        size = maxSize;
        cnt = 0;
        queueList = new DoublyLinkedList();
    }

    public void add(int val){
        if (isFull()){
            System.out.println("Queue is Full!");
            return;
        }
        queueList.insertLast(val);
        cnt += 1;
    }

    public int remove(){
        if (isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }else {
            Node n = queueList.deleteFirst();
            cnt --;
            return n.data;
        }
    }

    public boolean isEmpty(){
        return cnt == 0;
    }

    public boolean isFull(){
        return cnt == size;
    }
}
