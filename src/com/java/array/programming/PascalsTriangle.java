package com.java.array.programming;

import java.io.*;
import java.util.*;

public class PascalsTriangle {
    public List<List<Integer>> pascalsTriangle(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> innerList = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    innerList.add(1);
                } else {
                    List<Integer> prevList = outerList.get(i-1);
                    if(null != prevList){
                        innerList.add(prevList.get(j)+prevList.get(j-1));
                    }
                }
            }
            outerList.add(innerList);
        }
        return outerList;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        scanner.close();

        List<List<Integer>> result = new PascalsTriangle().pascalsTriangle(numRows);
        for (List<Integer> row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
