package com.lab.ds.lc;

/**


70. Climbing Stairs - Easy

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

**/

public class ClimbingStairs{
	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();
		int steps  = 40;
		System.out.println(cs.climbStairs(steps));
	}
	public int climbStairs(int steps){
		return climbStairsM(steps, new int[steps+1]);
	}
	//memoization & recursion
	public int climbStairsM(int steps, int [] memo){
		if(steps<0) return 0;
		if(steps==0) return 1;
		if(memo[steps]==0){
			memo[steps]=climbStairsM(steps-1, memo)+climbStairsM(steps-2, memo);
		}
		return memo[steps];
	}
}