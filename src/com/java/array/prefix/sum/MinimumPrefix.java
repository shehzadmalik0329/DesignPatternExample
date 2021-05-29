package com.java.array.prefix.sum;

import java.util.*;

class MinimumPrefix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        long res = minimumPrefix(n, arr);

        System.out.println(res);

    }

    static long minimumPrefix(int n, int arr[]) {
    	long minValue = 0;
    	long sum = 0;
    	for(int i=0; i<n; i++){
    		sum += arr[i];
    		minValue = Math.min(minValue, sum);
    	}
    	return -minValue;
    }
}

