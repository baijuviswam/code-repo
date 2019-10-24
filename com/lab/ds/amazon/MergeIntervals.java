package com.lab.ds.amazon

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** LC 56. Merge Intervals

Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.

https://www.youtube.com/watch?v=qKczfGUrFY4

**/

public class MergeIntervals {

  public static void main(String[] args) {
    MergeIntervals mi = new MergeIntervals();
    int[][] intervals = new int[][]{{1,2},{6,15},{8,20},{15,22}, {5,35}, {8, 40},{5,33},{80, 120}};
    System.out.println(Arrays.deepToString(mi.merge(intervals)));
  }
  public int[][] merge(int[][] intervals) {
    if(intervals.length<=1){
      return intervals;
    }
    Arrays.sort(intervals, (arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
    //System.out.println(Arrays.deepToString(intervals));
    List<int[]>output_arr = new ArrayList<int[]>();
    int[] current_interval = intervals[0];
    output_arr.add(current_interval);

    for(int[] interval : intervals){
    //  int current_begin = current_interval[0];
      int current_end = current_interval[1];
      int next_begin = interval[0];
      int next_end = interval[1];

      if(current_end>=next_begin){
        current_interval[1] = Math.max(current_end, next_end);
      }else{
        current_interval = interval;
        output_arr.add(current_interval);
      }
    }
        return output_arr.toArray(new int[output_arr.size()][]);
    }
}
