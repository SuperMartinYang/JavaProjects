package com.arr;

public class Zero_Matrix{
    public void setZero(int[][] matrix, int row, int col){
        // keep track the rows or cols which have zero somewhere
        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];
        for (int i = 0; i < row; i ++){
            for (int j = 0; j < col; j ++){
                if (matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        // nullify rows and cols
        nullify(matrix, rows, cols, row, col);
    }
    private void nullify(int[][] matrix, boolean[] rows, boolean[] cols, int row, int col){
        // nullify_row and nullify_col respectively
        nullify_row(matrix, rows, col);
        nullify_col(matrix, cols, row);
    }
    private void nullify_row(int[][] matrix, boolean[] rows, int col){
        for (int i = 0; i < rows.length; i ++){
            if (rows[i])
                for (int j = 0; j < col; j ++)
                    matrix[i][j] = 0;
        }
    }
    private void nullify_col(int[][] matrix, boolean[] cols, int row){
        for (int j = 0; j < cols.length; j ++){
            if (cols[j])
                for (int i = 0; i < row; i ++)
                    matrix[i][j] = 0;
        }
    }
    public static void main(String args[]){
        int[][] matrix = {
                {1,1,1,1,1},
                {1,1,1,1,0},
                {1,1,1,0,1},
        };
        (new Zero_Matrix()).setZero(matrix, 3, 5);
        for (int[] row : matrix){
            for (int ele : row){
                System.out.print(ele);
                System.out.print('\t');
            }
            System.out.println();
        }

    }
}