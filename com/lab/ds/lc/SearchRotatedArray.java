package com.lab.ds.lc;


/**  

Leetcode # 81

Search in Rotated Sorted Array II

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).

You are given a target value to search. If found in the array return true, otherwise return false.

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
Follow up:

This is a follow up problem to Search in Rotated Sorted Array, where nums may contain duplicates.
Would this affect the run-time complexity? How and why?

**/

public class SearchRotatedArray{
	public static void main(String[] args) {
		SearchRotatedArray sra = new SearchRotatedArray();
		int [] nums = new int [] {2,5,6,0,0,1,2};
		int target = 7;
		System.out.println(sra.search(nums, target));
	}
	public boolean search(int[] nums, int target) {
		if(nums.length==0) return false;
		int pivot = 0; 
        for(int i=0; i<nums.length-1; i++){
        	if(nums[i]>nums[i+1]){
        		pivot = i;
        		break;
        	}
        }
        return hasElement(0, pivot+1, nums, target)||hasElement(pivot+1, nums.length, nums, target);
    }
    //binary search for the number
    public boolean hasElement(int start, int end, int[] nums, int target){
    	while(start<end){
    		int mid = start+end/2;
    		if(target==nums[mid]){
    			return true;
    		}else {
    			if (nums[mid] > target) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
    		}
    	}
    	return false;
    }

}