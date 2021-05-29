package com.java.array.two.pointers;

public class  ContigiousSequence {
	public static  long contigiousSequence1(int arr[] , int n) {
		int currentBest = arr[0];
		int overallBest = arr[0];
		for(int i=1; i<arr.length; i++){
			if(currentBest >= 0){
				currentBest += arr[i];
			} else {
				currentBest = arr[i];
			}
			
			if(currentBest > overallBest){
				overallBest = currentBest;
			}
		}
		return overallBest;
	}
	
	public static  long contigiousSequence(int arr[] , int n) {
		int best = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length; ++i){
			if(sum + arr[i] < best){
				sum = 0;
			} else {
				best = sum + arr[i];
			}
		}
		return best;
	}
	public static void  main (String args []) {

		int n = 8;
//		int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int arr [] = {4, 3, -2, 6, -14, 7, -1, 4, 5, 7, -10, 2, 9, -10, -5, -9, 6, 1};

		long max = contigiousSequence(arr, n);
		System.out.println(max);

	}
}
