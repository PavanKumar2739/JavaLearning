package searching;

public class SearchInRange {
	public static void main(String[] args) {
		int [] arr = {1,3,343,5,7,9,54,97,3,10,4,5,23,345,65,6,7,1};
		System.out.println(linearSearch(arr, 9,4,7));	
		
	}
	public static int linearSearch(int[] arr,int target,int start,int end) {
		if(arr.length==0) return -1;
		for(int index = start; index < end; index++) {
			int element = arr[index];
			if(element == target) return index;
		}
		//if nothing had found
		return -1;
	}

}
