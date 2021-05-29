package com.java.array.programming;

import java.util.*;

class NumbersWith5Factors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

//        76222 921178347
        long l = 33;
        long r = 1000;
        int minVal = Integer.MIN_VALUE;

        int ans = numbersWith5Factors(l, r);

        System.out.println(ans);
    }
    
    static int numbersWith5Factors2(long l, long r) {
    	int count = 0;
    	for(long i=l; i<=r; i++){
    		boolean is5Factors = isPerfect(i);
    		if(is5Factors)
    			count++;
    	}
    	return count;
    }
    
    
    
    private static boolean isPerfect(long inputNumber)
	{
	    int sum = 1;
	    for (int num = 2; num * num <= inputNumber; num++)
	    {
	        if (inputNumber % num==0)
	        {
	        	sum = sum + 2;
//	            if(num * num != inputNumber)
//	                sum = sum + 2;
//	            else
//	                sum = sum + 1;
	        }
	        if(sum > 5)
	        	break;
	    }
	    if (sum == 5)
	        return true;
	 
	    return false;
	}

    static int numbersWith5Factors1(long l, long r) {
    	int count = 0;
    	for(long i=l; i<=r; i++){
    		int factor = 2;
    		for(long j=2; j<=i/2; j++){
    			if((long)Math.pow(j, 4) > r)
        			break;
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
    
    static int numbersWith5Factors5(long l, long r) {
    	int count = 0;
    	for(long i=l; i<=r; i++){
    		if(i==1)
    			continue;
    		if((long)Math.pow(i, 4) > r)
    			break;
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
    	int N = 20000;
        int p[] = new int [20001];
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
        int count = 0;
        
    	for(int i=2; i<=(int)Math.ceil(Math.sqrt(Math.sqrt(R))); i++){
    		if(p[i]==1 && (long)Math.pow(i, 4) >= L && (long)Math.pow(i, 4) <= R){
    			count++;
    		}
    	}
    	return count;
//        for (int i = 1; i < N; i++)
//        {
//          // If current number is prime
//          if (p[i] == 1)
//          {
//            // Store the prime
//            prime[index++] = (int)(Math.pow(i, 4));
//          }
//        }
//   
//      // Stores the required count
//      int Count = 0;
//      for(int i = 0; i < index; i++)
//      {
//        int pri = prime[i];
//        if (pri >= L && pri <= R)
//        {
//          Count++;
//        }
//      }
//      return Count;
    }
    
    static int numbersWith5Factors10(long l, long r)
    {
    	int n = (int)r;
        boolean prime[] = new boolean[n + 1];
        if(l > 0){
        	for (int i = 0; i < l; i++)
                prime[i] = false;
        }
        for (int start = (int)l; start <= n; start++)
            prime[start] = true;
        
        int start1 = 2;
        if(l > 2){
        	start1 = (int)l;
        }
        for (int p = start1; p * p <= n; p++)
        {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true)
            {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int count = 0;
        // Print all prime numbers
        for (int i = start1; i <= n; i++)
        {
        	if((long)Math.pow(i, 4) > r)
        		break;
            if (prime[i] && (long)Math.pow(i, 4) <= r)
                count++;
            
        }
        return count;
    }
    
    static int checkPrime(long l, long r){
    	int num = (int)r;
    	boolean[] prime = new boolean[num+1];
    	
    	for(int i=2; i<=num; i++){
    		prime[i] = true;
    	}
    	
    	for(int p=2; p<=Math.sqrt(num); p++){
    		if(prime[p]){
    			for(int j=p; j*p<=num; j++){
    				prime[j*p] = false;
    			}
    		}
    	}
    	return 0;
    }

}
