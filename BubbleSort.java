import java.util.Arrays;

class BubbleSort{
	public static void main(String[] args) {
		int arr [] = new int [] { 100, 1, 10, 0, 12, 45, -1};
		BubbleSort bs = new BubbleSort();
		System.out.println(Arrays.toString(bs.sort(arr)));
	}
	public int[] sort(int [] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
}