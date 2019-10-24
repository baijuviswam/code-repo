class TerinarySearch{
	static int arr[];
	public static void main(String[] args) {
		arr = new int [] {1, 3, 5,9, 20, 40, 60, 90 , 100, 223, 444,566,600, 1219, 3000};
		int target = 100;
		TerinarySearch ts = new TerinarySearch();
		System.out.println("Found "+ts.search(arr, target));
	}
	public int search(int [] arr, int target){
		int lo=0;
		int hi =arr.length-1;
		return terinarySearch(lo, hi, target);
	}
	public int terinarySearch(int lo, int hi, int target){
		if(hi>=lo){
			int mid1 = lo + hi/3;
			int mid2 = hi - hi/3;

			if(target==arr[mid1]) return mid1;
			if(target==arr[mid2]) return mid2;

			if(target < arr[mid1]){
				return terinarySearch(lo, mid1-1, target);
			} else if(target > arr[mid2]){
				return  terinarySearch(mid2+1, hi, target);
			} else{
				return terinarySearch(mid1+1, mid2-1, target);
			}
		}
		return -1;
	}
}