package com.linearsearch;

public class App1 {
    public static void main(String[] args){
        int[] myIntArray = new int[]{1, 2, 3, 4, 5};
        linearSearch(myIntArray, 5);
    }
    public static int linearSearch(int[] a, int x){
        for (int i = 0; i < a.length; i ++){
            if (a[i] == x)
                System.out.println("The value " + x + " is found at index " + i);
                return i;
        }
        return -1;
    }
}
