package com.lab.ds.dcp;

public class StringToNumberCheck {
	public static void main(String[] args) {
		StringToNumberCheck sc = new StringToNumberCheck();
		String s = "90e4";
		if(s.matches("[+-]?([0-9]*[.])?[0-9]+"))

		System.out.println(sc.strToInt(s));
	}
	
	public int strToInt(String str){
		int i = 0;
		boolean isNeg = false;
		int num = 0;
		if(str.charAt(0)=='-'){
			isNeg = true;
			i=1;
		}
		while(i<str.length()){
			num = num*10;
			num = num + str.charAt(i++) - '0';
		}
		if(isNeg){
			return num * -1;
		}
		return num;
	}

}