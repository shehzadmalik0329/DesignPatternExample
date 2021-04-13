package com.java.array.programming;

import java.util.*;


class AddNumbers{
    public static void main(String args[]){
        int n = 4;
        int m = 3;
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(4);
        List<Integer> B = new ArrayList<>();
        B.add(4);
        B.add(5);
        B.add(8);
        List<Integer> result = addNumbers(n, m, A, B);
        for (Integer x : result) {
            System.out.print(x);
        }
    }

    //1124
    //0458
    static List<Integer> addNumbers(int n, int m, List<Integer> A, List<Integer> B){
    	int maxCapacity = n > m ? n : m;
    	Integer[] resultArray = new Integer[maxCapacity];
    	int firstListRevIdx = n-1;
    	int secondListRevIdx = m-1;
    	int resultListRevIdx = maxCapacity-1;
    	int carryOver = 0;
    	while(firstListRevIdx>=0 || secondListRevIdx>=0){
    		//get first list digit in reverse
    		int first = 0;
    		if(firstListRevIdx >= 0){
    			first = A.get(firstListRevIdx);
    		}
    		int second = 0;
    		if(secondListRevIdx >= 0){
    			second = B.get(secondListRevIdx);
    		}
    		int sum = first + second + carryOver;
    		int remainder = sum > 9 ? sum%10 : sum;
    		carryOver = sum > 9 ? 1 : 0;
    		resultArray[resultListRevIdx--] = remainder;
    		firstListRevIdx--;
    		secondListRevIdx--;
    	}
    	if(carryOver > 0){
    		List<Integer> resList = new ArrayList<>();
    		resList.add(carryOver);
    		resList.addAll(Arrays.asList(resultArray));
    		return resList;
    	} else {
    		return Arrays.asList(resultArray);
    	}
    }
}
