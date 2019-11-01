package com.lab.ds.lc;

/*

Leetcode # 680

Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
Note:
The string will only contain lowercase characters a-z. The maximum length of the string is 50000.

**/

public class ValidPalindromeII{

	public static void main(String[] args) {
		String s = "aba";
		ValidPalindromeII vp = new ValidPalindromeII();
		System.out.println(vp.isPalindrome(s));
	}
	public boolean isPalindrome(String s) {
		if(s.length() <= 1) {
            return true;
        }
        return isValidPalindrome(s, 0, s.length()-1, false);
    }
        
    private boolean isValidPalindrome(String s, int beg, int end, boolean once) {
        
        while(beg <= end ) {
            if(s.charAt(beg) == s.charAt(end)) {
                beg++;
                end--;
            } else if (once) {
                return false;
            } else {
                return isValidPalindrome(s,beg+1, end, true) || isValidPalindrome(s,beg, end-1, true);
            }
        }
    return true;
  }
}