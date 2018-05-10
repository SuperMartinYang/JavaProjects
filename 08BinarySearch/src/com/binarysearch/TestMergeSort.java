package com.binarysearch;


import java.util.Arrays;

public class TestMergeSort {
    public static void main(String[] args){
        int[] myArr = {9,8,99,110,8,87,635,13,12};
        myArr = mergeSort(myArr);
        for (int i = 0; i < myArr.length; i ++)
            System.out.println(myArr[i] + "  ");
    }
    public static int[] mergeSort(int [] arr){
        int start = 0, stop = arr.length;
        if (stop - start == 1)
            return arr;
        int mid = (stop + start) / 2;
        int[] right = mergeSort(Arrays.copyOfRange(arr, start, mid));
        int[] left = mergeSort(Arrays.copyOfRange(arr, mid, stop));
        return merge(right, left);
    }

    /**
     * 9 8 99 110 8 87 635 13 12
     * right : 9 8 99 110   0-1 2-3
     * left : 8 87 635 13 12
    */
    public static int[] merge(int [] right, int[] left){
        int [] tmpArr = new int[right.length + left.length];
        int i = 0, j = 0, k = 0;
        while (j < right.length || k < left.length){
            if (j < right.length && k < left.length)
                tmpArr[i ++] = right[j] < left[k]? right[j ++] : left[k ++];
            else if (j < right.length)
                tmpArr[i ++] = right[j ++];
            else
                tmpArr[i ++] = left[k ++];
        }
        return tmpArr;
    }
}
