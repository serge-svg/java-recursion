package com.svg.java.recursion;

public class MatrixValuesPrinter {

    protected void printValues(int[][] matrix, int row, int col) {
        System.out.print(matrix[row][col] + " ");
        if (row != matrix.length - 1 || col != matrix[row].length - 1) {
            if (col == matrix[row].length - 1) {
                row++;
                col = 0;
                System.out.println("");
            } else {
                col++;
            }
            printValues(matrix, row, col);            
        } 
    }
    
}
