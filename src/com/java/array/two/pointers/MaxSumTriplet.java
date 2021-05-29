package com.java.array.two.pointers;

import java.util.*;

public class MaxSumTriplet {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();

            long result = maxSumTriplet(n, arr);

            System.out.println(result);

        }


	}

	static long maxSumTriplet1(int n, long arr[]) {
		if(arr.length == 0)
			return 0;
		long max = 0;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n-1; j++){
				for(int k=j+1; k<n; k++){
					if(arr[i] < arr[j] && arr[j] < arr[k]){
						long sum = arr[i] + arr[j] + arr[k];
						if(sum > max){
							max = sum;
						}
					}
				}
			}
		}
		return max;
	}
	
	static long maxSumTriplet2(int n, long arr[]) {
		if(arr.length == 0)
			return 0;
		long ans = 0;
		for(int j=1; j<n-1; j++){
			long maxI = 0, maxK = 0;
			for(int i=0; i<j; i++){
				if(arr[i] < arr[j])
					maxI = Math.max(maxI, arr[i]);
			}
			for(int k=j+1; k<n; k++){
				if(arr[j] < arr[k])
					maxK = Math.max(maxK,arr[k]);
			}
			if(maxI > 0 && maxK > 0)
				ans = Math.max(ans, maxI + arr[j] + maxK);
		}
		return ans;
	}
	
	static long maxSumTriplet(int n, long arr[]) {
		if(arr.length == 0)
			return 0;
		long[] maxSuffixArray = new long[n+1];
		maxSuffixArray[n] = 0;
		for(int i=n-1; i>=0; i--){
			maxSuffixArray[i] = Math.max(arr[i], maxSuffixArray[i+1]);
		}
		
		long ans = 0;
		
		TreeSet<Long> lowValue = new TreeSet<>();
		lowValue.add(Long.MIN_VALUE);
		
		for(int i=0; i<n; ++i){
			if(maxSuffixArray[i+1] > arr[i]){
				ans = Math.max(ans, lowValue.lower(arr[i]) + arr[i] + maxSuffixArray[i+1]);
				lowValue.add(arr[i]);
			}
		}
		return ans;
	}
}

