package com.java.array.programming;

class ZigzagConversion {
	public static void main(String args[]) {
		int n = 12;
		String str = "LEARNBYDOING";
		int k = 4;
		String result = zigzagConversion(n, str, k);
		System.out.println(result);
	}

	//LYEBDGANONRI
	//LYEBDGANONRI
	static String zigzagConversion(int n, String str, int k) {
		String[][] zigzag = new String[k][str.length()];
		int dir = 0;
		boolean flag = true;
		for(int i=0; i<str.length(); i++){
			zigzag[dir][i] = ""+str.charAt(i);
			if(flag){
				dir++;
			} else {
				dir--;
			}
			if(dir==k-1){
				flag = false;
			} else if(dir==0){
				flag = true;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<k; i++){
			String[] temp = zigzag[i];
			for(int j=0; j<temp.length; j++){
				if(null != temp[j]){
					sb.append(temp[j]);
				}
			}
		}
		return sb.toString();
	}
}
