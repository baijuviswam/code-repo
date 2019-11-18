package com.lab.ds.lc;
import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		Anagrams an = new Anagrams();
		String s1 = "bbb";
		String s2 = "aaa";
		System.out.println(an.isAnagram(s1, s2));
}
	public boolean isAnagram(String s1, String s2){
	if(s1.length() != s2.length()) 
		return false;
	char [] cA1 = s1.toCharArray();
	char [] cA2 = s2.toCharArray();
	Arrays.sort(cA1);
	Arrays.sort(cA2);
	if(String.valueOf(cA1).equals(String.valueOf(cA2))){
			return true;
		} else{
			return false;
		}
	}
}