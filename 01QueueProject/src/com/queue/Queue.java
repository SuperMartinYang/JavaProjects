package com.queue;

import java.util.EmptyStackException;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size){
        maxSize = size;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long value) {
        if (isFull()){
            System.out.println("The Queue is full");
        }else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queArray[++ rear] = value;
            nItems ++;
        }
    }

    public long remove() throws Exception {
        if (isEmpty()){
            System.out.println("The Queue is empty");
            throw new Exception(new EmptyStackException());
        }else{
            if (front == maxSize)
                front = 0;
            long value = queArray[front ++];
            nItems --;
            return value;
        }
    }

    public void view() {
        System.out.print('[');
        for (int i = 0; i < maxSize; i ++)
            System.out.print(queArray[i] + "  ");
        System.out.print(']');
    }

    public boolean isFull(){
        return nItems == maxSize;
    }
    public boolean isEmpty(){
        return nItems == 0;
    }
}
