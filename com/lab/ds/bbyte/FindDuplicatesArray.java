package com.lab.ds.bbyte;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * 
 * Question: Given an array of integers where each value 1 <= x <= len(array), write a
 * function that finds all the duplicates in the array.
 * eg.
 * dups([1, 2, 3]) = []
 * dups([1, 2, 2]) = [2]
 * dups([3, 3, 3]) = [3]
 * dups([2, 1, 2, 1]) = [1, 2]
 *
 */

public class FindDuplicatesArray {

	public static void main(String[] args) {
		FindDuplicatesArray fa = new FindDuplicatesArray();
		int[] num = new int[] {2, 1, 2, 1};
		System.out.println(Arrays.toString(fa.findDupes(num)));
	}

	public Object[] findDupes(int[] num) {
		Set<Integer> dupeSet= new HashSet<Integer>();
		Set<Integer> set= new HashSet<Integer>();
		for(int i=0; i<num.length; i++) {
			if(set.contains(num[i])) {
				dupeSet.add(num[i]);
			}else {
				set.add(num[i]);
			}
		}
		return dupeSet.toArray();
	}

}
