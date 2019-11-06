package com.lab.ds.cci;
import java.util.List;
import java.util.LinkedList;

/** 

Walmart telephone interview question

Given a list of items in a salad bar, return the possible combinations to make a salad"

**/	

public class SaladBar{
	public static void main(String[] args) {
		SaladBar sb = new SaladBar();
		String items [] = new String []{"Carrot", "Lettuce", "Tomato"};
		System.out.println(sb.getSaladCombinations(items));
	}
	public List<List<String>> getSaladCombinations(String[] items){
		return combinations(items, 0);
	}

	public List<List<String>> combinations(String[] items, int i){
		if(i==items.length){
			List<List<String>> response = new LinkedList<List<String>>();
			List<String> result = new LinkedList<String>();
			response.add(result);
			return response;
		}
		List<List<String>> response = new LinkedList<List<String>>();
		for(List<String> result: combinations(items, i+1)){
			//Exclude the current item
			response.add(new LinkedList<String>(result));
			//Include the current item
			result.add(0, items[i]);
			response.add(new LinkedList<String>(result));
		}
		return response;
	}

}