package com.arr;

public class Rotate_Matrix_inplace {
    /**
     public int[][] rotate_inplace(int[][] matrix){

     }
     */
    public static void rotate(int[][] matrix, int n){
        for (int i = 0; i < n /2; i ++){
            for (int j = i; j < n - 1 -  i; j ++){
                int tmp1 = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = matrix[i][j];
                int tmp2 = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = tmp1;
                tmp1 = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = tmp2;
                matrix[i][j] = tmp1;
            }
        }
    }
    public static void main(String args[]){
        int[][] matrix = {
                {1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}
        };
        (new Rotate_Matrix_inplace()).rotate(matrix, 4);
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}