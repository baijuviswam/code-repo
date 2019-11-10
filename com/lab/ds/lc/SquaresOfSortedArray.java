package com.lab.ds.lc;
import java.util.Arrays;

public class SquaresOfSortedArray {

	/**

	Leetcode #977. Squares of a Sorted Array


	Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

	 

	Example 1:

	Input: [-4,-1,0,3,10]
	Output: [0,1,9,16,100]
	Example 2:

	Input: [-7,-3,2,3,11]
	Output: [4,9,9,49,121]
	 

	Note:

	1 <= A.length <= 10000
	-10000 <= A[i] <= 10000
	A is sorted in non-decreasing order.

	**/

	public static void main(String[] args) {
		SquaresOfSortedArray ssa = new SquaresOfSortedArray();
		int [] numbers = new int [] {-7,-3,2,3,11};
		//System.out.println(Arrays.toString(ssa.sortedSquares(numbers)));
		System.out.println(Arrays.toString(ssa.sortedSquaresAlt(numbers)));

	}
	public int[] sortedSquares(int[] A){
		for(int i=0; i<A.length; i++){
			A[i] = A[i] * A[i];
		}
		Arrays.sort(A);
		return A;
	}

	public int[] sortedSquaresAlt(int[] A) {
		int[] res = new int[A.length];
		int lo = 0; int hi = A.length - 1;
		for (int i = A.length - 1; i >= 0; i--) {
			if(Math.abs(A[lo]) >= Math.abs(A[hi])){
				res[i]=A[lo] * A[lo];
				lo++;
			}else{
				res[i] = A[hi]*A[hi];
				hi--;
			}
		}
		return res;
	}
}