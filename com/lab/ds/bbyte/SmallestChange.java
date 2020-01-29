package com.lab.ds.bbyte;

/**

26. Smallest Change
Question: Given an input amount of change x, write a function to determine the
minimum number of coins required to make that amount of change.
eg. (using American coins)
change(1) = 1
change(3) = 3
change(7) = 3
change(32) = 4

**/


public class SmallestChange {
	public static void main(String[] args) {
		int amount = 99;
		SmallestChange sc = new SmallestChange();
		System.out.println(sc.getSmallestChange(amount));
	}
	
	public int getSmallestChange(int amount) {
		int counter = 0;
		while(amount !=0) {
			if(amount >= 100) {
				amount = amount - 100;
				counter++;
			}else if (amount<100 && amount>=50) {
				amount = amount-50;
				counter++;
			}else if (amount<50 && amount>=25) {
				amount=amount-25;
				counter++;
			}else if (amount<25 && amount>=10) {
				amount = amount-10;
				counter++;
			}else if (amount<10 && amount>=5) {
				amount = amount-5;
				counter++;
			}else if (amount<5) {
				amount = amount-1;
				counter++;
			}
		}
		return counter;
	}
	
}
