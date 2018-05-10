package com.quicksort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int [] arr, int start, int stop){
        if (start >= stop)
            return;
        int p = partition(arr, start, stop);
        quickSort(arr, start, p - 1);
        quickSort(arr, p + 1, stop);
    }
    public static int partition(int [] arr, int start, int stop){
        int pivot = arr[stop];
        int i = start, j = stop;
        while (i < j){
            while (i < j && arr[i] <= pivot)
                i++;
            while (i < j && arr[j] >= pivot)
                j--;
            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }
        arr[stop] = arr[j];
        arr[j] = pivot;
        return i;
    }
    public static void main(String[] args){
        int [] myArr = {12, 81, 74, 43, 1098, 0, 8};
        quickSort(myArr, 0, myArr.length - 1);
        System.out.println(Arrays.toString(myArr));
    }
}
