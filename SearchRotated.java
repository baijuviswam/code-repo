public class SearchRotated{
	public static void main(String[] args) {
		SearchRotated sr = new SearchRotated();
		int [] arr = new int[]{5,6,7,0,1,2,3,4};
		int target = 3;
		System.out.println(sr.search(arr, target));
	}
	public int search(int [] arr, int target){
		return binarySearch(arr, 0, arr.length-1, target);
	}
	public int binarySearch(int [] nums, int left, int right, int target){
		if(left>right) return -1;
		int mid = left + (right - left )/2;
		if(target==nums[mid]) return mid;

		if(nums[left] <= nums[mid]){
			if(nums[left]<=target && target<nums[mid]){
				 return binarySearch(nums,left, mid-1, target);
			}else{
				return  binarySearch(nums, mid+1, right, target);
			}
		}else{
			if(nums[mid]<target&& target<=nums[right]){
          		return  binarySearch(nums,mid+1, right, target);
        	}else{
         	 return  binarySearch(nums, left, mid-1, target);
        	}
		}
	}
}