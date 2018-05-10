package com.binarysearch;

public class TestSelectionSort {
    public static void main(String[] args){
        int[] myArray = selectionSort(new int[]{9, 8, 7 , 3, 11});
        for (int i = 0; i < myArray.length; i ++){
            System.out.println(myArray[i]);
        }
    }
    public static int[] selectionSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i])
                    minimum = j;
            }
            int tmp = a[i];
            a[i] = a[minimum];
            a[minimum] = tmp;
        }
        return a;
    }
}
