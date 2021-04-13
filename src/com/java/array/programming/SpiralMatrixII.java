package com.java.array.programming;


class SpiralMatrixII {
	public static void main(String args[]) {
		//        Scanner sc = new Scanner(System.in);
		int n = 2;
		int result[][] = spiralMatrixII(n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] spiralMatrixII(int n) {
		int[][] result = new int [n][n];
		int top = 0, down = n-1;
		int left = 0, right = n-1;
		int val = 1;
		int dir = 0;
		
		while(top<=down && left<=right){
			//moving left to right
			if(dir==0){
				for(int i=left; i<=right; i++){
					result[top][i] = val++;
				}
				top += 1;
			}
			//moving top to down
			else if(dir==1){
				for(int i=top; i<=down; i++){
					result[i][right] = val++;
				}
				right -= 1;
			}
			//moving right to left
			else if(dir==2){
				for(int i=right; i>=left; i--){
					result[down][i] = val++;
				}
				down -= 1;
			}
			//moving down to top
			else if(dir==3){
				for(int i=down; i>=top; i--){
					result[i][left] = val++;
				}
				left += 1;
			}
			dir = (dir+1)%4;
		}
		
		return result;
	}
}

