public class MergeIntervals{
	public static void main(String[] args) {
		
	}
	public int[][] merge(int[][] intervals) { //2d array
    int m=intervals.length;
        int count=0;
 if(intervals.length ==0 || intervals[0].length ==0)
   {
       return intervals;
   } 
        
  else{  
    for(int i=0;i<m-1;i++){
        if(intervals[i].length==0){
          continue;}
       for(int j=i+1;j<m;j++){
    if(intervals[i].length !=0 && intervals[j].length !=0  ){  
       if(intervals[j][0]<=intervals[i][1] && intervals[i][0]<=intervals[j][1]){ //overlap range 
        intervals[j][1]=Math.max(intervals[i][1],intervals[j][1]);
        intervals[j][0]=Math.min(intervals[i][0],intervals[j][0]);
         int[] a=new int[0];
        intervals[i]= a;
          count++;
           break;          
       }
    }

    }
}
      int[][] result=new int[m-count][2];
      int t=0;
  for(int i=0;i<m;i++){
      if(intervals[i].length !=0){
        result[t]=intervals[i];
      t++;}
    }
 return result;
    }
   
}
}