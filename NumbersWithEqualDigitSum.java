import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class NumbersWithEqualDigitSum {
	public static void main(String[] args) {
		//int[] arr = new int[]{51,17,71,42};
		NumbersWithEqualDigitSum ns = new NumbersWithEqualDigitSum();
		System.out.println(ns.getSum(new int[]{51, 71, 17, 42, 33, 44, 24, 62}));
        System.out.println(ns.getSum(new int[]{51, 71, 17, 42}));
        System.out.println(ns.getSum(new int[]{42, 33, 60}));
        System.out.println(ns.getSum(new int[]{51, 32, 43}));
	}
	public int getSum(int[] arr){
		int maxSum=-1;
		Map<Integer, Integer>map = new HashMap<Integer, Integer>();
		for(int num : arr){
			int sum=getDigitsSum(num);
			if(!map.containsKey(sum)) {
				map.put(sum, num);
				continue;
			}
			maxSum=Math.max(maxSum, num+map.get(sum));
			if(num>map.get(sum)) {
				map.put(sum, num);
			}
		}
		return maxSum; 
	}
	//get the sum of digits
	public int getDigitsSum(int num){
		int sum =0 ;
		while(num>0){
			int reminder = num%10;
			sum=sum+reminder;
			num=num/10;
		}
		return sum;
	}
}