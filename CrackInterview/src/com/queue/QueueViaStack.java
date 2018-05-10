package com.queue;

import com.stack.Stack;

import java.util.EmptyStackException;

public class QueueViaStack<T>{
    private Stack<T> head;
    private Stack<T> tail;

	public QueueViaStack(int size){
        head = new Stack<>(size);
        tail = new Stack<>(size);
    }

    public void add(T data) throws Exception {
        if (tail.isFull()){
            System.out.println("Queue is Full!");
            throw new Exception(new StackOverflowError());
        }
        tail.push(data);
    }

    public T remove() throws Exception {
        if (head.isEmpty()){
            if (tail.isEmpty()){
                System.out.println("Queue is Empty!");
                throw new Exception(new EmptyStackException());
            }else {
                while (!tail.isEmpty()){
                    head.push(tail.pop());
                }
            }
        }
        return head.pop();
    }

//    public T peek(){
//
//    }
//
//    public boolean isEmpty(){
//
//    }
}