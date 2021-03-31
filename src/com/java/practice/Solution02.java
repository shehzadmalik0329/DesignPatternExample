package com.java.practice;

public class Solution02 {

	public static void main(String[] args) {
		//no three consecutive letters
		System.out.println(solution(1, 4));
	}
	
	public static String solution(int A, int B) {
        // write your code in Java SE 8
        String first, second;
        int max=0, min=0;
        if(A >= B){
            first = "a";
            second = "b";
            max = A;
            min = B;
        } else {
            first = "b";
            second = "a";
            max = B;
            min = A;
            
        }
        int total = A+B;
         StringBuffer sb = new StringBuffer();
         if(max-min == 0){
             for(int i=0; i<max; i++){
                 sb.append(first).append(second);
             }
         } else if(max-min == 1){
             for(int i=0; i<min; i++){
                 sb.append(first).append(second);
             }
             sb.append(first);
         } else {
             while(total > 0){
                 if(max > 2){
                     sb.append(first).append(first);
                     max = max - 2;
                 } else if(max > 0){
                     sb.append(first);
                     max = max - 1;
                 }
                 if(min > 0){
                	 sb.append(second);
                     min = min - 1;
                 }
                 total = (max+min);
             }
         }

         return sb.toString();

    }

}
