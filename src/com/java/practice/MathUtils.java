package com.java.practice;

public class MathUtils {
    public static double average(int a, int b) {
        try{
            return (a + b) / 2;
        } catch(Exception e){
            e.printStackTrace();
            return 0.0;
        }
        
    }

    public static void main(String[] args) {
        System.out.println(average(0,-1));
    }
}
