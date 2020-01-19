package com.lab.ds.dcp;


public class ReverseInteger{
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		int num = Integer.MIN_VALUE;
		System.out.println("Number :"+num);
		System.out.println("Reversed :"+ri.reverseInt(num));
	}
	public long reverseInt(int num){
		long reversedInt = 0;
		while(num!=0){
			reversedInt = reversedInt *10 + num%10;	
			num=num/10;
		}
		return reversedInt;
	}
}
