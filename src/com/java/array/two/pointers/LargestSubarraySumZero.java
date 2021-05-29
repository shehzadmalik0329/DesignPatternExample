package com.java.array.two.pointers;

import java.util.*;

class LargestSubarraySumZero {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		ArrayList<Integer> res = largestSubarraySumZero(n, arr);

		for (int j : res)
			System.out.print(j + " ");

	}

	static ArrayList<Integer> largestSubarraySumZero(int n, int arr[]) {
		int sum = 0;
		int startIndex = -1, endIndex = -1;
		int maxSubArrayLength = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++){
			sum += arr[i];
			if(sum == 0){
				maxSubArrayLength = i+1;
				startIndex = 0;
				endIndex = i;
			} else {
				if(!map.containsKey(sum)){
					map.put(sum, i);
				} else {
					int index = map.get(sum);
					if(i-index > maxSubArrayLength){
						maxSubArrayLength = i-index;
						startIndex = index+1;
						endIndex = i;
					}
				}
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		if(startIndex == -1 && endIndex == -1){
			list.add(-1);
		} else {
			for(int i=startIndex; i<=endIndex; i++){
				list.add(arr[i]);
			}
		}
		return list;
	}
}

