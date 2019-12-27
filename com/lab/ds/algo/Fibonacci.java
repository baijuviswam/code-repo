package com.lab.ds.algo;

/*1. Top-down with Memoization */

public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		//int n = 10;
		System.out.println("N--10 "+fib.calculateFibonacci(10));
		System.out.println("N--20 "+fib.calculateFibonacci(20));
		System.out.println("N--30 "+fib.calculateFibonacci(30));
	}
	public int calculateFibonacci(int n){
		int [] memoize = new int[n+1];
		return calculateFibonacciRecursive(memoize, n);
	}
	public int calculateFibonacciRecursive(int [] memoize, int n){
		if (n<2){
			return n;
		}
		//if we have already solved this subproblem, simply return the result from the cache
		if(memoize[n]!=0){
			return memoize[n];
		}
		memoize[n] = calculateFibonacciRecursive(memoize, n-1)  + calculateFibonacciRecursive(memoize, n-2);
		return memoize[n];
	}
}