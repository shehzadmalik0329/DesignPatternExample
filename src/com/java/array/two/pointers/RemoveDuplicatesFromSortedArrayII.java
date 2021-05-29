package com.java.array.two.pointers;

import java.util.*;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = 7;
        int arr[] = {2,2,2,3,4,4,9};

        int res = removeDuplicatesFromSortedArrayII(n, arr);

        System.out.println(res);

        for (int i = 0; i < res; i++)
            System.out.print(arr[i] + " ");

    }

    static int removeDuplicatesFromSortedArrayII(int n, int[] arr) {
    	if(arr.length == 0)
    		return 0;
    	
    	int st = 0;
    	 
        for (int i = 0; i < n; i++) {
     
            if (i < n - 2
                && arr[i] == arr[i + 1]
                && arr[i] == arr[i + 2])
                continue;
     
            // Updating the 2nd pointer
            else {
                arr[st] = arr[i];
                st++;
            }
        }
        return st;
    }

}

