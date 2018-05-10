package com.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import com.stack.*;


public class SetOfStacks{
    private int stackCapacity;
    private ArrayList<Stack> stacks;
    private int maxIndex;

    public SetOfStacks(int size){
        stackCapacity = size;
        stacks = new ArrayList<>();
        new Stack(stackCapacity).push(stacks);
        maxIndex = 0;
    }

    public void push(int value){
        if (stacks.get(maxIndex).isFull()){
            Stack newStack = new Stack(stackCapacity);
            newStack.push(value);
            stacks.add(newStack);
            maxIndex ++;
        }else {
            stacks.get(maxIndex).push(value);
        }
    }

    public int pop() throws Exception {
        if (stacks.get(maxIndex).isEmpty()){
            stacks.remove(maxIndex);
            maxIndex --;
        }
        return (int) stacks.get(maxIndex).pop();
    }

    public int popAt(int index) throws Exception {
        if (index > maxIndex){
            System.out.println("Index out of range!");
            throw new Exception(new IndexOutOfBoundsException());
        }else {
            if (stacks.get(index).isEmpty()){
                System.out.println("Stack is Empty.");
                throw new Exception(new EmptyStackException());
            }
            return (int) stacks.get(index).pop();
        }
    }

}