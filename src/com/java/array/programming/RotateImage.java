package com.java.array.programming;

import java.io.*;
import java.util.*;

public class RotateImage {
    public void rotateImage(int[][] matrix) {
    	// matrix transpose row-column (important: traverse only in upper triangle)
    	for(int i=0; i<matrix.length; i++){
    		for(int j=i; j<matrix[0].length; j++){
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] = temp;
    		}
    	}
    	//reverse row by row
    	for(int i=0; i<matrix.length; i++){
    		for(int j=0,k=matrix[0].length-1; j<k; j++,k--){
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[i][k];
    			matrix[i][k] = temp;
    		}
    	}
    }

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        int matrixSize = 3;
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
//        for (int i = 0; i < matrixSize; ++i) {
//            for (int j = 0; j < matrixSize; ++j) {
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//        scanner.close();

        new RotateImage().rotateImage(matrix);
        for (int i = 0; i < matrixSize; ++i) {
            for (int j = 0; j < matrixSize; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

