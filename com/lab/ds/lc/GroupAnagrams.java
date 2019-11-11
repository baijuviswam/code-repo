package com.lab.ds.lc;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;


/**

Leetcode # 49. Group Anagrams

Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.

**/


public class GroupAnagrams {
	public static void main(String[] args) {
		GroupAnagrams ga = new GroupAnagrams();
		String[] anagrams = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(ga.groupAnagrams(anagrams));
	}
	public List<List<String>>  groupAnagrams(String [] anagrams){
		if (anagrams == null || anagrams.length == 0) return new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(String s : anagrams){
			char [] cArr = s.toCharArray();
			Arrays.sort(cArr);
			String s1 = String.valueOf(cArr);
			if(!map.containsKey(s1)){
				map.put(s1, new ArrayList<String>());
			}
			map.get(s1).add(s);
		}
		return new ArrayList<List<String>>(map.values());
	}
}