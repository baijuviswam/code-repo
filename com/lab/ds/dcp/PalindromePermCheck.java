package com.lab.ds.dcp;

import java.util.Set;
import java.util.HashSet;

/***
DCP # 157

Given a string, determine whether any permutation of it is a palindrome.

For example, carrace should return true, since it can be rearranged to form racecar, which is a palindrome. 
daily should return false, since there's no rearrangement that can form a palindrome.

**/

public class PalindromePermCheck {
	public static void main(String[] args) {
		PalindromePermCheck ppc = new PalindromePermCheck();
		String s = "daily";
		System.out.println("Is permutaion palindrome for word "+s+" - "+ppc.permCheck(s));
		String s1 = "racecar";
		System.out.println("Is permutaion palindrome for word "+s1+" - "+ppc.permCheck(s1));
	}
	public boolean permCheck(String s){
		Set<Character> set = new HashSet<Character>();
		for(char c : s.toCharArray()){
			if(set.contains(c)){
				set.remove(c);
			}else{
				set.add(c);
			}
		}
		return set.size()==0 || set.size()==1;
	}
}