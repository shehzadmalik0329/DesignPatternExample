package com.java.practice;

public class TestClassXor {

	public static void main(String[] args) {
		int[] intArray = {1, 3, 1, 4, 3};
		int size = intArray.length;
		int pairCount = 0;
		for(int i=0; i<size-1; i++){
			for(int j=i+1; j<size; j++){
//				if(getXOR(intArray[i], intArray[j]) == 0){
				if(intArray[i] == intArray[j]){
					pairCount++;
				}
			}
		}
		System.out.println(pairCount);
	}
	
	private static int getXOR(int x, int y){
		return (x | y) & (~x | ~y);
	}

}
