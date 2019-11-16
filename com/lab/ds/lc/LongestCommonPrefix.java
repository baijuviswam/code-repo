package com.lab.ds.lc;

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