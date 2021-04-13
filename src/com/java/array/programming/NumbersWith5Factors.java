package com.java.array.programming;

import java.util.*;

class NumbersWith5Factors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long l = 1;
        long r = 81;

        int ans = numbersWith5Factors(l, r);

        System.out.println(ans);
    }

    static int numbersWith5Factors1(long l, long r) {
    	int count = 0;
    	for(long i=l; i<=r; i++){
    		int factor = 2;
    		for(long j=2; j<=i/2; j++){
    			if(i%j == 0){
    				factor++;
    			}
    			if(factor>5){
    				break;
    			}
    		}
    		if(factor == 5){
    			count++;
    		}
    	}
    	return count;
    }
    
    static int numbersWith5Factors3(long l, long r) {
    	int count = 0;
    	for(long i=r; i>=l; i--){
    		if(i > 1 && isPrime((long)Math.sqrt(Math.sqrt(i)))){
    			count++;
    		}
    	}
    	return count;
    }
    
    static int numbersWith5Factors2(long l, long r) {
    	int count = 0;
    	for(long i=l; i<=r; i++){
    		if(i==1)
    			continue;
    		if(isPrime(i) && Math.pow(i, 4) <= r){
    			count++;
    		}
    	}
    	return count;
    }
    
    static boolean isPrime(long num){
    	boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
          // condition for nonprime number
          if (num % i == 0) {
            flag = true;
            break;
          }
        }

        if (!flag)
          return true;
        else
          return false;
    }
    
    static int numbersWith5Factors(long L,long R)
    {
    	//Sieve
    	int prime[] = new int [20000];
    	int index = 0;
    	int N = (int)R;
        int p[] = new int [N + 1];
        for(int i = 0; i <= N; i++)
        {
          p[i] = 1;
        }
        // Mark 0 and 1 as non-prime
        p[0] = p[1] = 0;
        for (int i = 2; i * i <= N; i++)
        {
          // If i is prime
          if (p[i] == 1)
          {
            // Mark all its factors as non-prime
            for (int j = i * i; j <= N; j += i)
            {
              p[j] = 0;
            }
          }
        }
        for (int i = 1; i < N; i++)
        {
          // If current number is prime
          if (p[i] == 1)
          {
            // Store the prime
            prime[index++] = (int)(Math.pow(i, 4));
          }
        }
   
      // Stores the required count
      int Count = 0;
      for(int i = 0; i < index; i++)
      {
        int pri = prime[i];
        if (pri >= L && pri <= R)
        {
          Count++;
        }
      }
      return Count;
    }

}
