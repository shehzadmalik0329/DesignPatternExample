package com.java.array.programming;

import java.util.Scanner;

public class IncrementNumber {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int arr[] = {1, 1, 2};

//        for(int i=0;i<n;i++) {
//            arr[i] = Integer.parseInt(sc.next());
//        }

        int incArr[] = incrementNumber(n, arr);

        for(int i=0;i<incArr.length;i++) {
            System.out.print(incArr[i]);
        }
        
    }

    static int[] incrementNumber(int n, int arr[]){
    	int[] resultArray = new int[n];
    	int revIdx = n-1;
    	int carryOver = 0;
    	int sum = 0;
    	for(int i=revIdx; i>=0; i--){
    		if(i==n-1){
    			sum = arr[revIdx] + 1;
    		} else {
    			sum = arr[revIdx] + carryOver;
    		}
    		int remainder = sum > 9 ? sum%10 : sum;
    		carryOver = sum > 9 ? 1 : 0;
    		resultArray[revIdx--] = remainder;
    	}
    	if(carryOver > 0){
    		int[] finalArray = new int[n+1];
    		finalArray[0] = carryOver;
    		for(int i=0; i<n; i++){
    			finalArray[i+1] = resultArray[i];
    		}
    		return finalArray;
    	} else {
    		return resultArray;
    	}
    }

}
