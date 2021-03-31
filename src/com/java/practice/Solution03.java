package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class Solution03 {

	public static void main(String[] args) {
		//domino pyramid
		int[] A = {4, 3, 3, 4, 1, 2, 2, 3, 6, 5, 4, 5};
		System.out.println(solutionNew(A));
	}
	
	public static String solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.length; i++){
            int num = A[i];
            if(null ==map.get(num)){
                map.put(num,1);
            } else {
                map.put(num, map.get(num)+1);
            }
        }
        int singleIndexCounter = 0;
        int doubleIndexCounter = 0;
        int counter = 0;
        String answer = "";
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                Integer singleIndex = entry.getKey();
                if(A[6] == singleIndex || A[11] == singleIndex){
                    singleIndexCounter++;
                }
            }
            if(entry.getValue() == 2){
                Integer doubleIndex = entry.getKey();
                if(
                    (A[2] == doubleIndex && A[7] == doubleIndex) ||
                    (A[5] == doubleIndex && A[10] == doubleIndex)
                ){
                    doubleIndexCounter++;
                }
            }
            if(entry.getValue() == 3){
                counter++;
            }
        }
        if(counter != 2){
            answer = "NO";
        } else if(counter == 2 && singleIndexCounter == 2 && doubleIndexCounter == 4) {
            answer = "YES";
        }

        return answer;
    }
	
	public static String solutionNew(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.length; i++){
            int num = A[i];
            if(null ==map.get(num)){
                map.put(num,1);
            } else {
                map.put(num, map.get(num)+1);
            }
        }
        int singleIndexCounter = 0;
        boolean singleIndexFlag = false;
        int doubleIndexCounter = 0;
        boolean doubleIndexFlag = false;
        int counter = 0;
        boolean maxIndexFlag = false;
        int[] B = new int[A.length];
        String answer = "";
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                singleIndexCounter++;
                if(!singleIndexFlag){
                    B[6] = entry.getKey();
                    singleIndexFlag = true;
                } else {
                    B[11] = entry.getKey();
                }
            }
            if(entry.getValue() == 2){
                doubleIndexCounter++;
                if(!doubleIndexFlag){
                    B[2] = entry.getKey();
                    B[7] = entry.getKey();
                    doubleIndexFlag = true;
                } else {
                    B[5] = entry.getKey();
                    B[10] = entry.getKey();
                }
            }
            if(entry.getValue() == 3){
                counter++;
                if(!maxIndexFlag){
                    B[0] = entry.getKey();
                    B[3] = entry.getKey();
                    B[8] = entry.getKey();
                    maxIndexFlag = true;
                } else {
                    B[1] = entry.getKey();
                    B[4] = entry.getKey();
                    B[9] = entry.getKey();
                }
            }
        }
        if(counter != 2){
            answer = "NO";
        }
        int matchCount = 0;
        for(int i=0; i<A.length-2; i += 2){
        	int first = B[i];
        	int second = B[i+1];
        	
        	for(int j=0; j<A.length-2; j+=2){
        		if(
        				(A[j]==first && A[j+1]==second) || (A[j]==second && A[j+1]==first)
        				){
        			matchCount++;
        		}
        	}
        }
        if(matchCount == 6){
        	answer = "YES";
        } else {
        	answer = "NO";
        }

        return answer;
    }

}
