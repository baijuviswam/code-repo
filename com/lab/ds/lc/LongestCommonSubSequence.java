package com.lab.ds.lc;
import java.util.Map;
import java.util.HashMap;


public class LongestCommonSubSequence{
	public static void main(String[] args) {
		String X = "ABCBDAB";
		String Y = "BDCABA";
		LongestCommonSubSequence lcs = new LongestCommonSubSequence();
		//Create a map to store solutions of the sub problems 
		Map<String, Integer> lookup = new HashMap<String, Integer>();
		System.out.println("The length of LCS is "+lcs.LCSLength(X, Y, X.length(), Y.length(), lookup));
		System.out.println("The length of LCS is "+lcs.LCSLengthII(X, Y));
	}

	//using map

	public int LCSLength(String X, String Y, int m, int n, Map<String, Integer> lookup){
		//returen if you have reched the end of the string 
		if(m==0 || n==0) return 0;
		//Construct a key
		String key = m + "|" + n;
		//if sub problem is seen for the firsttime, store it in the map
		if(!lookup.containsKey(key)){
			//if last char of X & Y matches 
			if(X.charAt(m-1)==Y.charAt(n-1)){
				lookup.put(key, LCSLength(X, Y, m-1, n-1, lookup)+1);
			}else {
				// if the last char of X & Y doesn't match
				lookup.put(key, Math.max(LCSLength(X, Y, m, n-1, lookup), LCSLength(X, Y, m-1, n, lookup)));
			}
		}
		return lookup.get(key);
	}

	//using matrix

	public int LCSLengthII(String X, String Y){
		int m = X.length();
		int n = Y.length();
		int[][] T = new int[m+1][n+1];
		//fill the lookup table in bottom-up manner.
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				if(X.charAt(i-1)==Y.charAt(j-1)){
					T[i][j] = T[i-1][j-1]+1;
				}else{
					T[i][j] = Math.max(T[i-1][j], T[i][j-1]); 
				}
			}
		}
		return T[m][n];
	}

}