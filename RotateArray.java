import java.util.Arrays;


public class RotateArray {
	public static void main(String[] args) {
		RotateArray ra = new RotateArray();
		int [] arr = new int [] {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println(Arrays.toString(ra.rotate(arr, k)));
	}
	public int[] rotate(int[] nums, int k) {
		int n = nums.length;
        if(k==0 || n==0) return nums;
        if(k>0) {
			int i=0;
			while(i<k){
				int j=0;
				while(j<n-1){
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					++j;
				} 	
				System.out.println(Arrays.toString(nums));
				++i;
			}
        }
        return nums;
    }
}