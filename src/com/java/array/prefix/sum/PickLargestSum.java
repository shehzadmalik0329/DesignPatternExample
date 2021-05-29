package com.java.array.prefix.sum;

import java.util.*;


class PickLargestSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        long result = pickLargestSum(N, B, A);
        System.out.println(result);
        sc.close();
    }

    static long pickLargestSum(int N, int B, List<Integer>A){
    	long maxSum = 0;
    	for(Integer a: A){
    		maxSum += a;
    	}
    	long baseSum = 0;
    	int i = 0, j = N-B-1;
    	for(int k=i; k<=j; k++){
    		baseSum += A.get(k);
    	}
    	i++;j++;
    	long minSum = baseSum;
    	while(j<N){
    		baseSum += A.get(j) - A.get(i-1);
    		minSum = Math.min(minSum, baseSum);
    		i++; j++;
    	}
    	return maxSum-minSum;
    }
}

