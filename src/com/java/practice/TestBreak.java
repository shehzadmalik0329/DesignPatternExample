package com.java.practice;

public class TestBreak {

	public static void main(String[] args) {
		int[] array = {1,3,4,5,7};
		int[] indexArray = {4,5,3,7,1};
		
		for(int i=0; i< array.length; i++){
			int val = array[i];
			for(int j=0; j<array.length; j++){
				if(indexArray[j] == val){
					System.out.println(j+" ");
					break;
				}
			}
		}

	}

}
