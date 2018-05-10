package com.binarysearch;

import java.util.Arrays;

public class TestRadixSort {
    public static void main(String[] args){
        int[] myArr = {137,823,199,2342,188,933,264,673};
        radixSort(myArr);
        for (int i = 0; i < myArr.length; i ++) {
            System.out.println(myArr[i]);
        }
    }

    private static void radixSort(int[] myArr) {
        int longestVal = Math.max(myArr);

    }

}
