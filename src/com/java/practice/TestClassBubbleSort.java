package com.java.practice;

public class TestClassBubbleSort {

	public static void main(String[] args) {
		int[] intArray = {1, 3, 2, 5, 4};
//		int[] intArray = {6, 2, 1, 8, 5, 7, 3, 4};
		
		bubbleSort(intArray);
	}
	
	private static void bubbleSort(int[] array){
		int count = 0;
		int n = array.length;
		
		boolean swapped = true;
		while(swapped != false){
			swapped = false;
			count += 1;
			for(int i = 0; i<n-1; i++){
				if(array[i] > array[i+1]){
					swap(array, i, i+1);
					swapped = true;
				}
			}
		}
		System.out.println(count);
		
	}
	
	private static void swap(int[] array, int i, int j){
		if(i == j)
			return;
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
