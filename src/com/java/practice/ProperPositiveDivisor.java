package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ProperPositiveDivisor {

	public static void main(String[] args) {
		System.out.println(solve(6));
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		List<List<Integer>> tables = new ArrayList<>();
		IntSummaryStatistics stats = primes.stream()
		                                     .mapToInt((x) -> x)
		                                     .summaryStatistics();
		System.out.println(stats.getAverage());
	}
	
	static String solve(int N){
        if(N == 1)
        return "NO";
        String answer = "NO";
        int sum = 1;
        for(int i=2; i<N; i++){
            if(N%i == 0){
                sum += i;
            }
        }
        if(sum == N){
            answer = "YES";
        }
        return answer;
    }

}
