/**

Given an integer list where each number represents the number of hops you can make, determine whether you can reach to the last index starting at index 0.

**/

public class HopesToLastIndexZero{
	public static void main(String[] args) {
		HopesToLastIndexZero hz = new HopesToLastIndexZero();
		int [] arr = new int[]{2, 0, 1, 0};
		System.out.println(hz.hopeToZero(arr));
		System.out.println(hz.hopeToZero(new int[] {1, 1, 0, 1}));
		System.out.println(hz.hopeToZero(new int[] {1, 3, 0, 1}));
		System.out.println(hz.hopeToZero(new int[] {0, 1, 0, 0}));
		System.out.println(hz.hopeToZero(new int[] {1, 0}));
	}
	public boolean hopeToZero(int [] arr){
		boolean isHoppable = false;
		int i=0;
		int j=arr.length-1;
		while (i<arr.length){
			//System.out.println(i);
			if(arr[i]==0 && i==j) {
				isHoppable=true;
				break;
			}else if(arr[i]==0){
				isHoppable=false;
				break;
			}else{
				i+=arr[i];
			}
		}
		return isHoppable;
	}
}