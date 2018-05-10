package com.binarysearch;

public class App {
    public static void main(String[] args){
        int[] myIntArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(binarySearch(myIntArray, 3));
        System.out.println(recursiveBinarySearch(myIntArray, 0, myIntArray.length - 1, 3));
    }
    public static int binarySearch(int[] a, int x){
        int p = 0;
        int r = a.length - 1;
        while (p <= r){
            int q = (p + r) / 2;
            if (x < a[q])
                r = q - 1;
            else if (x > a[q])
                p = q + 1;
            else
                return q;
        }
        return -1;
    }

    public static int myBinarySearch(int[] a, int x){
        int lo = 0;
        int hi = a.length - 1;
        while (lo + 1 < hi){
            int mid = (hi - lo) / 2 + lo;
            if (x < a[mid])
                hi = mid;
            else if (x > a[mid])
                lo = mid;
            else
                return mid;
        }
        if (x == a[lo]) return lo;
        if (x == a[hi]) return hi;
        return -1;
    }

    public static int recursiveBinarySearch(int[] a, int start, int stop, int x){
        System.out.println("{ " + start + " ... " + stop + " }");
        int mid = (start + stop) / 2;
        if (a[mid] == x)
            return mid;
        else if (x < a[mid])
            return recursiveBinarySearch(a, start, mid - 1, x);
        else
            return recursiveBinarySearch(a, mid + 1, stop, x);
    }
}
