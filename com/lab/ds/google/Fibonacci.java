package com.lab.ds.google;

/**

1. return nth Fibonacci number.
2. for given nth Fibonacci number return the position, without calculating the Fibonacci.
3. calculate nth Fibonacci if the number may exceed the range

**/

public class Fibonacci{
	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		int n = 20;
		System.out.println(n+"th fibonacci number : "+fibo.findFibo(n));
		System.out.println(n+"th fibonacci number position : "+fibo.findPos(n));
	}

	public int findFibo(int n){
		int [] cache =  new int[n+1];
		return findFiboMemo(n,cache);
	}

	public int findFiboMemo(int n, int[] cache){
		if(n==0) return 0;
		else if(n==1) return 1;
		else if(cache[n]!=0){
			return cache[n];
		}else{
			cache[n]  = findFiboMemo(n-1, cache) + findFiboMemo(n-2, cache);
		}
		return cache[n];
	}

	public int findPos(int n){
		if(n <= 1) return n;
		int index=0;
		int a = 0, b=1, c=1;
		while (c<n){
			c = a + b;
			index++;
			a=b;
			b=c;
		}
		return index;
	}
}

