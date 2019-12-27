package com.lab.ds.algo;


public class KnapSackI{
	public static void main(String[] args) {
		KnapSackI kpI = new KnapSackI();
		int[] profits = new int []{1, 6, 10, 16};   
		int[] weights = new int []{1, 2, 3, 5};
		//int capacity = 7;
		System.out.println("Total knapsack profit ---> "+kpI.knapSack(profits, weights, 7));
		System.out.println("Total knapsack profit ---> "+kpI.knapSack(profits, weights, 6));

	}
	private int knapSack(int[] profits, int[] weights, int capacity){
		return this.knapSackRecursive(profits, weights, capacity, 0);
	}
	private int knapSackRecursive(int[] profits, int[] weights, int capacity, int currentIndex){
		//base case 
		if(capacity<=0 ||  currentIndex>=profits.length){
			return 0;
		}
		// recursive call after choosing the element at the currentIndex
    	// if the weight of the element at currentIndex exceeds the capacity, we shouldn't process this
		int profit1 = 0;
		if(weights[currentIndex]<=capacity){
			profit1 = profits[currentIndex]+knapSackRecursive(profits, weights,capacity-weights[currentIndex], currentIndex+1);
		}
		// recursive call after excluding the element at the currentIndex
		int profit2 = knapSackRecursive(profits, weights, capacity, currentIndex+1);

		return Math.max(profit1, profit2);

	}
}