package com.lab.ds.search;

class TwoPointerLenierSearch{
	public static void main(String[] args) {
		TwoPointerLenierSearch lpls = new TwoPointerLenierSearch();
		int target=10;
		int [] arr = new int[]{1,2,3,4,5,10,15,20,40, 100};
		System.out.println(" Item :"+lpls.search(arr, target));
	}
	public int search(int [] arr, int target){
		int i=0; 
		int j=arr.length-1;
		int idx=-1;
		while(i<j){
			if(arr[i]==target){
				idx = i;
				return idx;
			}
			if(arr[j]==target ){
				idx = j;
				return idx;
			}
			i++; j--;
		}
		return idx;
	}
}