package com.lab.ds.dcp;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


/**

DCP # 140

Given an array of integers in which two elements appear exactly once and all other elements appear exactly twice, find the two elements that appear only once.

For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8. The order does not matter.

Follow-up: Can you do this in linear time and constant space?

**/

public class ExactlyOnceArray {
	public static void main(String[] args) {
		ExactlyOnceArray ea = new ExactlyOnceArray();
		int arr [] = new int [] {2, 4, 6, 8, 10, 2, 6, 10};
		System.out.println(ea.numbersExaclyOnce(arr));
	}
	public List<Integer> numbersExaclyOnce(int [] numbers){
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		List<Integer> response = new ArrayList<Integer>(2);
		for(int i =0; i<numbers.length; i++){
			if(!map.containsKey(numbers[i])){
				map.put(numbers[i], 1);
			}else{
				map.put(numbers[i], map.get(numbers[i])+1);
			}
		}
		for(Map.Entry<Integer,Integer> hmap : map.entrySet()){
			if(hmap.getValue()==1)
     			response.add(hmap.getKey());
     	}
		return  response;

	}
}
