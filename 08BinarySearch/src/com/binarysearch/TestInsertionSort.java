package com.binarysearch;

public class TestInsertionSort {
    public static void main(String [] args){
        int[] myArray = {9,8,99,110,8,87,635,13,12};
        for(int i = 0;i < myArray.length;i++){
            System.out.print(insertionSort(myArray)[i] + " ");
        }
    }

    /**
     * 25 47 3 19 8 18
     *       i
     * j
     * 25 47 47
     * 25 25 47
     * 3  25 47
     *       ele
     * @param arr
     * @return
     */
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int element = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > element){
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = element;
        }
        return arr;
    }
}
