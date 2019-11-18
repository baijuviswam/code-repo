package com.lab.ds.dcp;
import java.util.List;
import java.util.ArrayList;

/**

Daily Coding Problem: Problem #126 [Medium]

Write a function that rotates a list by k elements. For example, [1, 2, 3, 4, 5, 6] rotated by two becomes [3, 4, 5, 6, 1, 2]

**/


public class RotateListByKElements{
	public static void main(String[] args) {
		RotateListByKElements re = new RotateListByKElements();
		List<Integer> elements = new ArrayList<Integer>();
		elements.add(1);
		elements.add(2);
		elements.add(3);
		elements.add(4);
		elements.add(5);
		elements.add(6);
		//elements.add(7);
		int k = 3;
		// System.out.println(re.rotateList(elements, k));
		System.out.println(re.rotateSwap(elements, k));
	}
	//rotateList
	public List<Integer> rotateList(List<Integer>  numbers, int k){
		List<Integer> response = new ArrayList<Integer>(numbers.size());
		int i=k;
		int j=numbers.size();
		while(i<j){
			response.add(numbers.get(i));
			++i;
		}
		i=0;
		while(i<k){
			response.add(numbers.get(i));
			++i;	
		}
		return response;
	}

	public List<Integer> rotateSwap(List<Integer> numbers, int k){
		int i = 0;
		while(i<numbers.size()-k){
			int temp = numbers.get(i);
			numbers.set(i, numbers.get(i+k));
			numbers.set(i+k, temp);
			++i;
		}
		return numbers;
	}
}