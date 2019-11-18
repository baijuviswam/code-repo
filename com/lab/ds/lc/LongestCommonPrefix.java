package com.lab.ds.lc;

/**

Longest Common Prefix - lc # 14

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.

**/

public class LongestCommonPrefix {
	public static void main(String[] args) {
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String strs [] = new String [] {"flower","flow","florida","float"};
		System.out.println(lcp.longestCommonPrefix(strs));
	}
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0) return "";
		String prefix = strs[0]; // assing the first element in the array as the prefix
		for(int i=1; i<strs.length; ++i){
			while(strs[i].indexOf(prefix)!=0){
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
		return prefix;
	}
}