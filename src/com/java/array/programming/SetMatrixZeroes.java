package com.java.array.programming;

import java.io.*;
import java.util.*;

class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] matrix) {
    	int row = matrix.length;
    	int col = matrix[0].length;
    	int[] rows = new int[row];
    	int[] cols = new int[col];
    	
    	for(int i=0; i<row; i++){
    		for(int j=0; j<col; j++){
    			if(matrix[i][j] == 0){
    				rows[i] = -1;
    				cols[j] = -1;
    			}
    		}
    	}
    	
    	for(int i=0; i<row; i++){
    		for(int j=0; j<col; j++){
    			if(rows[i] == -1 || cols[j] == -1){
    				matrix[i][j] = 0;
    			}
    		}
    	}
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 3;
        int m = 4;

        int[][] matrix = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};

//        for(int i = 0 ; i < n ; ++i) {
//            for(int j = 0 ; j < m ; ++j) {
//                matrix[i][j] = in.nextInt();
//            }
//        }

        in.close();
        new SetMatrixZeroes().setMatrixZeroes(matrix);

        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < m ; ++j) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
