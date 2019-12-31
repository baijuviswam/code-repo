package com.lab.ds.dcp;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/**
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return the numbers since 10 + 7 is 17. 

Bonus: Can you do this in one pass?
**/

public class TwoSum {
	////brute force solution. Time O(n^2), space O(1)
	public int[] twoSum(int[] num, int target){
		for(int i=0; i<num.length; i++){
			for(int j=1; j<num.length; j++){
				if(num[i]+num[j]==target){
					return new int[]{num[i], num[j]};
				}
			}
		}
		return new int[]{};
	}

	//using HashMap 
	public int[] twoSumII(int [] num, int target){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<num.length; i++){
			int element = target - num[i];
			if(map.containsKey(element) && map.get(element)!=i){
				// return new int[]{i, map.get(element)}; for index of the elements 
				return new int[]{num[i], num[map.get(element)]};
			}else{
				map.put(num[i],i);
			}
		}
		return new int[]{};
	}

	public static void main(String[] args) {
		TwoSum tsum = new TwoSum();
		int num [] = new int[]{10, 15, 3, 7};
		int target = 17;
		System.out.println(Arrays.toString(tsum.twoSum(num, target)));
		System.out.println(Arrays.toString(tsum.twoSumII(num, target)));
	}

}