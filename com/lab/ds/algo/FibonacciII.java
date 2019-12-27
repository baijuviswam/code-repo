package com.lab.ds.algo;

/* 2. Bottom-up with Tabulation # */

public class FibonacciII {
	public static void main(String[] args) {
		FibonacciII fb2 = new FibonacciII();
		System.out.println("N--10 "+fb2.calculateFibonacci(10));
		System.out.println("N--20 "+fb2.calculateFibonacci(20));
		System.out.println("N--30 "+fb2.calculateFibonacci(30));
	}
	public int calculateFibonacci(int n){
    	int dp[] = new int[n+1];
    	//base cases
    	dp[0] = 0;
    	dp[1] = 1;

    	for(int i=2; i<= sn; i++){
    		dp[i] = dp[i-1]+dp[i-2];
    	}
    	return dp[n];
	}
}