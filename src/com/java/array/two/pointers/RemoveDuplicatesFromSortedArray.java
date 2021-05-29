package com.java.array.two.pointers;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    
    // Implement your solution by completing the below function
    public int removeDuplicates(int[] nums) {
    	if(nums.length == 0)
    		return 0;
        int st = 0;
        for(int i=1; i<nums.length; i++){
        	if(nums[i] > nums[st]) {
        		st++;
        		nums[st] = nums[i];
        	}
        }
        return st+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        scanner.close();

        int result = new RemoveDuplicatesFromSortedArray().removeDuplicates(numbers);
        System.out.print(Integer.toString(result));
    }
}
