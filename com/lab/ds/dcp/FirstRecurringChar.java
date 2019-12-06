package com.lab.ds.dcp;

import java.util.Set;
import java.util.HashSet;


/**

DCP# 159

Given a string, return the first recurring character in it, or null if there is no recurring character.

For example, given the string "acbbac", return "b". Given the string "abcdef", return null.

**/


public class FirstRecurringChar {
	public static void main(String[] args) {
		FirstRecurringChar frc = new FirstRecurringChar();
		String s = "acbbac";
		System.out.println(frc.getFirstRecurringChar(s));
		String s1 = "abcdef";
		System.out.println(frc.getFirstRecurringChar(s1));

	}
	public String getFirstRecurringChar(String s){
		Set<Character> set = new HashSet<Character>();
		for(char c : s.toCharArray()){
			if(set.contains(c)){
				return String.valueOf(c);
			}else{
				set.add(c);
			}
		}
		return null;
	}
}