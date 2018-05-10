package com.dp;

public class PaintFill {
    enum Color {White, Yellow, Black, Orange, Purple};
    public static void solver(Color[][] matrix, Color ori, Color tgt, int row, int col) {
        if (row < 0 || row > matrix.length || col < 0 || col > matrix[0].length){
            return;
        }
        if (matrix[row][col] == ori){
            matrix[row][col] = tgt;
            solver(matrix, ori, tgt, row + 1, col);
            solver(matrix, ori, tgt, row - 1, col);
            solver(matrix, ori, tgt, row, col + 1);
            solver(matrix, ori, tgt, row, col - 1);
        }
    }
    public static void solver(Color[][] matrix, Color tgt, int row, int col){
        if (matrix[row][col] == tgt)
            return;
        solver(matrix, matrix[row][col], tgt, row, col);
    }
    public static void main(String[] args){
        Color[][] matrix = new Color[10][10];
        solver(matrix, Color.Black, 3, 4);
    }
}
