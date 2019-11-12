package com.lab.ds.dcp;
import java.util.Arrays;

/**

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

**/

public class ProductOfArray {
	public static void main(String[] args) {
		ProductOfArray poa = new ProductOfArray();
		int arr [] = new int [] {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(poa.productOfArray(arr)));
	}
	public int[] productOfArray(int [] arr){
		int []  res = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			int sum=1;
			for(int j=0; j<arr.length; j++){
				if(i!=j){
					sum = sum * arr[j];
				}
			}
			res[i]=sum;
		}
		return res;
	}

}
	