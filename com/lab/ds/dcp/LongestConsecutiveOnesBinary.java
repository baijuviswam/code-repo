package com.lab.ds.dcp;

/**

DCP # 214

This problem was asked by Stripe.

Given an integer n, return the length of the longest consecutive run of 1s in its binary representation.

For example, given 156, you should return 3.

**/

public class LongestConsecutiveOnesBinary{
	public static void main(String[] args) {
		LongestConsecutiveOnesBinary lb = new LongestConsecutiveOnesBinary();
		System.out.println(lb.maxConsecutiveOnes(156));
	}

	public int maxConsecutiveOnes(int x){
		int count = 0; 
		while(x!=0){
			x=(x & (x<<1));
			count++;
		}
		return count;
	}
}