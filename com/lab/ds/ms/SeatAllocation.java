package com.lab.ds.ms;
import java.util.*;

public class SeatAllocation{
	public static void main(String[] args) {
		SeatAllocation sa = new SeatAllocation();
		int n = 2;
		String s = "1A 1C 2F";
		System.out.println(sa.allocateFamilySeats(n, s));
	}
	public int allocateFamilySeats(int n, String s){
		int seatGrp = 0;
		String[] strs = s.split(" ");
		Map<Integer, Set<Character>> map = new HashMap<>();
		// create the empty set with rows
		for(int i=1; i<=n; i++){
			map.put(i, new HashSet<Character>());
		}
		for(String str : strs){
			map.get(Integer.parseInt(str.substring(0, str.length()-1))).add(str.charAt(str.length()-1));
		}
		for(Map.Entry<Integer, Set<Character>> entry :  map.entrySet()){
			Set<Character> set = entry.getValue();
			if(set.contains('E') && set.contains('F')){
				continue;
			}
			if(!set.contains('B') && !set.contains('C') && !set.contains('D') && !set.contains('E')) {
				seatGrp++;
				set.addAll(Arrays.asList('B', 'C', 'D', 'E'));
			}
			if(!set.contains('D') && !set.contains('E') && !set.contains('F') && !set.contains('G')) {
				seatGrp++;
				set.addAll(Arrays.asList('D', 'E', 'F', 'G'));
			}
			if(!set.contains('F') && !set.contains('G') && !set.contains('H') && !set.contains('J')) {
				seatGrp++;
				set.addAll(Arrays.asList('F', 'G', 'H', 'J'));
			}
		}
		return  seatGrp;
	}
}