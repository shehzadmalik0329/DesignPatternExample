package com.java.array.two.pointers;


import java.util.*;

class MergeIntervals {

    public int[][] mergeIntervals(int[][] intervals) {
    	Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
    	Stack<int[]> stack = new Stack<>();
    	
    	stack.push(intervals[0]);
    	
    	for(int i=1; i<intervals.length; i++){
    		int[] temp = intervals[i];
    		int[] stackTop = stack.peek();
    		if(temp[0] > stackTop[1]){
    			stack.push(temp);
    		} else {
    			int[] top = stack.pop();
    			top[1] = temp[1] > top[1] ? temp[1] : top[1];
    			stack.push(top);
    		}
    	}
    	int[][] ans = new int[stack.size()][];
    	for(int i=stack.size(); i>0; i--){
    		ans[i-1] = stack.pop();
    	}
    	return ans;
    	
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int[][] results = new MergeIntervals().mergeIntervals(nums);

        for (int i = 0; i < results.length; ++i) {
            System.out.printf("%d %d\n", results[i][0], results[i][1]);
        }
    }
}

