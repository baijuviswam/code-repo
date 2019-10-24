package com.lab.ds.search;
import java.util.Arrays;

public class SelectionSort{
	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int arr[] = new int []{7,9,4,0, 21};
		System.out.println(Arrays.toString(ss.selectionSort(arr)));
	}
	public int[] selectionSort(int[] arr){
		int min;
		for(int i=0; i<arr.length; i++){
			min = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[min]){
					min =j;
				}

			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}