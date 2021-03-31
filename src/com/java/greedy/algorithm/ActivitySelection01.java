package com.java.greedy.algorithm;

import java.util.Arrays;

public class ActivitySelection01 {

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 }; 
	    int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
	    
	    //sort the array
	    Arrays.sort(arr);
	    Arrays.sort(dep);
	    //print 1st
	    // iterate from 2nd - if start >= end of previous
	    int n = arr.length;
	    int platform = 1, result = 1;
	    int i=0, j=0;
	    while(i<n && j<n){
	    	if(arr[i] <= dep[j]){
	    		platform++;
	    		i++;
	    	} else if(arr[i] > dep[j]){
	    		platform--;
	    		j++;
	    	}
	    }
	    if(platform > result){
	    	result = platform;
	    }
	    System.out.println(result);

	}

}
