package com.linearsearch;

public class App {
    public static void main(String[] args){
        int[] myIntArray = new int[]{1, 2, 3, 4, 5};
        linearSearch(myIntArray, 5);
    }
    public static int linearSearch(int[] a, int x){
        int answer = -1;
        for (int i = 0; i < a.length; i ++){
            if (a[i] == x)
                answer = i;
                System.out.println("The value " + x + " is found at index " + i);
        }
        return answer;
    }
}
