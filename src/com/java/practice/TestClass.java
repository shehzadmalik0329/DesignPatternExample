package com.java.practice;
import java.util.*;
class TestClass {
	public static void main(String args[] ) throws Exception {

		// Write your code here
		Scanner src = new Scanner(System.in);
		int elements = src.nextInt();
		int[] frequencies = new int[elements];
		for(int i = 0; i < elements; i++){
			frequencies[i] = src.nextInt();
		}

		int keys = src.nextInt();
		int maxLetters = 0;
		int[] keySize = new int[keys];
		for(int i = 0; i < keys; i++){
			int letters = src.nextInt();
			keySize[i] = letters;
			maxLetters += letters;
		}

		if(elements > maxLetters){
			System.out.println(-1);
		} else {
			int keystrokes = 0;
			int letter = 0;
			int reduceKeys = keys;
			sort(frequencies);
			sort(keySize);
			for(int i = 1; i <= elements; i++){
				int minKeys = keySize[keys-1];
				if(i == minKeys+1){
					reduceKeys = reduceKeys -1;
				}
				for(int j = 0; j < reduceKeys && letter < elements; j++){
					keystrokes += frequencies[letter] * i;
					letter++;
				}
			}

			System.out.println(keystrokes);
		}

	}

	private static void sort(int[] intArray){
		for(int lastUnsortedIndex = intArray.length - 1;
				lastUnsortedIndex > 0; lastUnsortedIndex--){
			int maxIndex = 0;
			for(int i = 1; i <= lastUnsortedIndex; i++){
				if(intArray[i] < intArray[maxIndex]){
					maxIndex = i;
				}
			}
			swap(intArray, maxIndex, lastUnsortedIndex);
		}
	}

	private static void swap(int[] array, int i, int j){
		if(i == j)
			return;
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
