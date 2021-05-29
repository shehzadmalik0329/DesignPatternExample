package com.java.array.prefix.sum;

import java.util.*;

class EqualPartition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int res = equalPartition(n, arr);

        System.out.println(res);

    }

    static int equalPartition(int n, long arr[]) {
    	int i = 0;
    	int j = n-1;
    	long leftSum = arr[i];
    	long rightSum = arr[j];
    	while(i<j){
    		if(leftSum == rightSum && i+1 == j-1){
    			i++;
    			break;
    		}
    		else if(leftSum < rightSum){
    			i++;
    			leftSum += arr[i];
    		}
    		else{
    			j--;
    			rightSum += arr[j];
    		}
    	}
    	if(i==j)
    		return -1;
    	return i;
    }
}
