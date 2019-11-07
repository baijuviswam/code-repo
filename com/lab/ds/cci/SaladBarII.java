package com.lab.ds.cci;
import java.util.List;
import java.util.LinkedList;

/** SaladBarII alternate solution **/

public class SaladBarII {
	public static void main(String[] args) {
		SaladBarII sb2 = new SaladBarII();
		String[] items = new String[] {"Tomato","Lettuce","Cuecumber"};
		System.out.println(sb2.getSalads(items));
	}
	public List<List<String>> getSalads(String[] items){
		List<List<String>>  response = new LinkedList<List<String>> ();
		combinations(items, 0, response, new LinkedList<String>());
		return response;
	}

	public void combinations(String[] items, int i, List<List<String>> response, List<String> path){
		if(i == items.length){
			response.add(path);
			return;
		}
		List<String> pathWithCurrent = new LinkedList<String>(path);
		pathWithCurrent.add(items[i]);
		//exclude the current item
		combinations(items, i+1, response, path);
		//include the current item
		combinations(items, i+1, response, pathWithCurrent);
	}
}