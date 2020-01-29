package com.lab.ds.bbyte;
import java.util.Arrays;

public class MedianOfSortedArr {
	public static void main(String[] args) {
		MedianOfSortedArr ms = new MedianOfSortedArr();
		int [] arr1 = new int [] {1,3,5};
		int [] arr2 = new int [] {2,4,6};
		System.out.println(ms.medianOfArrays(arr1, arr2));
	}
	public double medianOfArrays(int[] arr1, int [] arr2){
		int n = arr1.length+arr2.length;
		int [] sortedArr = new int[n];
		int count =0;

		sortedArr = merge(arr1, arr2, arr1.length, arr2.length);

		/**
		//construct the array
		for(int i = 0; i < arr1.length; i++) { 
         	sortedArr[i] = arr1[i];
         	count++;
     	} 
      	for(int j = 0; j < arr2.length; j++) { 
         	sortedArr[count++] = arr2[j];
      	} 
      	//sort it
        Arrays.sort(sortedArr);
		**/ 

		// find the median 
		double medain = 0.0;

		if (n % 2 != 0) 
        	return (double) sortedArr[n / 2]; 
        else 
        	return (double) (sortedArr[(n - 1) / 2] + sortedArr[n / 2]) / 2.0; 

	}

	public int[] merge(int[] nums1, int[] nums2, int m, int n){
	//merge the nums1 & nums2 arrays to new numbers[]
		 int [] numbers = new int[nums1.length+nums2.length];
		 int i = 0, j = 0;
			for (int k = 0; k < m+n; k++) {
				if ((j >= n) || (i < m && nums1[i] <= nums2[j])) {
					numbers[k] = nums1[i];
					i++;
				} else {
					numbers[k] = nums2[j];
					j++;
				}
			}
		return numbers;
	}
}