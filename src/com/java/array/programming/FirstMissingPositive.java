package com.java.array.programming;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    static int firstMissingPositive(int[] nums) {
    	Set<Integer> set = new HashSet<>();
    	for(int num: nums){
    		set.add(num);
    	}
    	int i = 1;
    	while(set.contains(i)){
    		i++;
    	}
    	return i;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int result = firstMissingPositive(nums);
        System.out.println(result);
    }
}
