package com.lab.ds.lc;

public class LongestCommonSubstring{
	public static void main(String[] args) {
		
		LongestCommonSubstring lcs = new LongestCommonSubstring();
		String X = "ABC";
		String Y = "BABA";

		System.out.println("Longest Common Substring "+lcs.LCS(X, Y, X.length(), Y.length()));
	}

	public String LCS(String X, String Y, int m, int n){
		int maxLength = 0; // stores the max legth of LCS
		int endingIndex = m; // stores the ending index of LCS of X


		//lookup[i][j] stores the length of the LCS of substring
		int [][] lookup = new int[m+1][n+1];  
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				//if the current char of X & Y matches
				if(X.charAt(i-1)==Y.charAt(j-1)){
					lookup[i][j]=lookup[i-1][j-1]+1;
					//update the max length and ending index.
					if(lookup[i][j]>maxLength){
						maxLength = lookup[i][j];
						endingIndex = i;
					}
				}
			}
		}
		//return the longest commnon substring having length maxlen
		return X.substring(endingIndex-maxLength, endingIndex);
	}
}