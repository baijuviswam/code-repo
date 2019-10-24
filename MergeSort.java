import java.util.Arrays;
public class MergeSort{
	public static void main(String[] args) {
		int [] arr = new int[] {0,3,-1,30, -10, 9, 100};
		MergeSort ms = new MergeSort();
		ms.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public void sort(int[] arr){
		 mergeSort(arr, 0, arr.length-1);
	}
	private void mergeSort(int[] numbers, int start, int end) {
		if(start<end){
			int mid = (int) Math.floor((start+end)/2);
			mergeSort(numbers, start, mid);
			mergeSort(numbers, mid+1, end);
			merge(numbers,start,mid,end);
		}
	}
	private void merge(int[] numbers, int start, int mid, int end){
		int sizeOfLeft = mid-start+1;
		int sizeOfRight = end - mid;
		int[] left = new int[sizeOfLeft];
		int[] right = new int[sizeOfRight];
		for (int i = 0; i < sizeOfLeft; i++) {
			left[i] = numbers[start + i]; 
		}
		for (int j = 0; j < sizeOfRight; j++) {
			right[j] = numbers[mid + 1 + j]; 
		}
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
				numbers[k] = left[i];
				i++;
			} else {
				numbers[k] = right[j];
				j++;
			}
		}
	}

}