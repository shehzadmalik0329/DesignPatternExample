package com.java.array.two.pointers;

import java.util.*;

class TwoSumInSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        boolean res = twoSumInSortedArray(n, arr, k);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);

    }

    static boolean twoSumInSortedArray1(int n, int arr[], int target) {
    	if(arr.length == 0)
    		return false;
    	int st = 0;
    	boolean flag = false;
    	for(int i=1; i<n; i++){
    		if(arr[i] == target-arr[st]){
    			flag = true;
    			break;
    		}
    		else if(arr[i] < target-arr[st])
    			continue;
    		else {
    			st++;
    			i = st;
    		}
    	}
    	return flag;
    }
    
    static boolean twoSumInSortedArray(int n, int arr[], int target) {
    	if(arr.length == 0)
    		return false;
    	int st = 0;
    	boolean flag = false;
    	int i=0, j=n-1;
    	while(i<j){
    		if(arr[i] + arr[j] > target)
    			j--;
    		else if(arr[i] + arr[j] < target)
    			i++;
    		else {
    			flag = true;
    			break;
    		}
    	}
    	return flag;
    }
}

