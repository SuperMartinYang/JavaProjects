package com.bubblesort;

import java.util.Scanner;

public class BubbleSort {
    public static void display(int[] someNums, int a){

    }
    public static void main(String [] args){
        int [] someNums = new int[5];
        Scanner keyboard = new Scanner(System.in);
        for (int a = 0; a < someNums.length; a++){
            System.out.print("Enter number " + (a + 1) + " >>");
            someNums[a] = keyboard.nextInt();
        }
        display(someNums, 0);
        for (int a = 0; a < someNums.length - 1; a ++){
            for (int b = 0; b < a; b ++){
                if (someNums[a] > someNums[b]){

                }
            }
        }

    }
}
