package com.lab.ds.uber;

import java.util.Arrays;

/**

Given an array i...n, return an array with sum of i-1, i, i+1 for each i in array. 

**/

public class ArraySum {
	public static void main(String[] args) {
		ArraySum as = new ArraySum();
		int [] arr = new int [] {-1,-1,-1,-1};
		System.out.println(Arrays.toString(as.getSumArray(arr, arr.length)));
	}
	public int[] getSumArray(int[] arr, int n){
		if(n<2) return arr;
		int [] res = new int [n];
		for(int i=-1, j=0, k=1; j<n; ++i, ++j, ++k){
			if(i==-1) {
				res[j] = arr[j]+arr[k];
			}else if(j==n-1){
				res[j]=arr[i]+arr[j];
			}else {
				res[j] = arr[i]+arr[j]+arr[k];
			}
		}
		return res;
	}
}