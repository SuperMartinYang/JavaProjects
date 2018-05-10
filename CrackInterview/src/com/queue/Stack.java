package com.queue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
    private int stackSize;
    private List<T> values;
    private int top;
    public Stack(int size){
        stackSize = size;
        values = new ArrayList<>();
        top = -1;
    }
    public void push(T value){
        if (isFull()) {
            System.out.println("Stack is Full!");
            return;
        }
        ++top;
        values.add(value);
    }

    public boolean isFull() {
        return top == stackSize - 1;
    }

    public T pop() throws Exception {
        if (isEmpty()){
            System.out.println("Stack is Empty");
            throw new Exception(new EmptyStackException());
        }
        T value = values.remove(top);
        top --;
        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
