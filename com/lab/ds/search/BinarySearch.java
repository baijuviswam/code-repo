package com.lab.ds.search;

class BinarySearch{
	public static void main(String[] args) {
		int arr[] = new int[]{1,10,20, 30, 50, 90, 122, 1213};
		int target = 122;
		BinarySearch bs = new BinarySearch();
		System.out.println("Found "+bs.search(arr, target));
	}
	public int search(int [] arr, int target){
		int lo = 0;
		int hi = arr.length-1;
		int idx = -1; 
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(target<arr[mid]){
				hi = mid -1;
			}else if(target>arr[mid]){
				lo = mid +1;
			}else{
				idx = mid;
				return idx;
			}
		}
		return idx;
	}
}