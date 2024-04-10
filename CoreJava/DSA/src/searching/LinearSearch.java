package searching;

public class LinearSearch {
	public static void main(String[] args) {
		int [] arr = {1,3,343,5,7,9,54,97,3,10,4,5,23,345,65,6,7,1};
		System.out.println(linearSearch(arr, 0));	
		System.out.println(linearSearch1(arr, 10));	
		
	}
	//search in the array: return index if found
	//return -1 if not found
	public static int linearSearch(int[] arr,int target) {
		if(arr.length==0) return -1;
		for(int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if(element == target) return index;
		}
		//if nothing had found
		return -1;
	}
	public static boolean linearSearch1(int[] arr,int target) {
		if(arr.length==0) return false;
		for(int element:arr) {
			if(element == target) return true;
		}
		//if nothing had found
		return false;
	}
}
