package com.lab.ds.algo;

public class KMP_String_Matching {
	public void KMPSearch(String pattern, String text){
		int j=0; // index for pattern
		int i=0; // index for text
		// create lps[] that will hold the longest prefix suffix values for pattern 
		int [] lps = new int[pattern.length()];
		
		while(i<text.length()) {
			if(pattern.charAt(j)==text.charAt(i)) {
				++j;
				++i;
			}
			if(j==pattern.length()) {
				System.out.println("Pattern found at index "+(i-j));
				j=lps[j-1];
				// mismatch after j matches 
			}else if(i<text.length() && pattern.charAt(j)!=text.charAt(i)){
				// Do not match lps[0..lps[j-1]] characters, they will match anyway 
				if(j!=0) {
					j = lps[j-1];
				}else {
					++i;
				}
			}
		}
	}
	
	public static void main(String args[]){ 
        String txt = "ABABABABABABABBABABABABABABACBABBA DAS BAABABBA ANANA NNNANANAN ANANA NA ANNAN "; 
        String pat = "AN"; 
        new KMP_String_Matching().KMPSearch(pat, txt); 
    } 
}