package binarySearch;

public class FindNum {
	public static int getNum(int[]arr,int target) {
		int start = 0;
		int end = arr.length-1;
		if(arr[end]<target) return arr[end];
		while(start<=end) {
			int middle = start+(end-start)/2;
			if(arr[middle]>target) {
				System.out.println("greater");
				end = middle-1;
				
			}else if(arr[middle]<target) {
				System.out.println("Lesser");
				start = middle+1;
			}
			else {
				return arr[middle];
			}
		}
		//return arr[end];  smallest number < = target
		return arr[start]; // greatest number >= target
		
	}
	public static void main(String[] args) {
		int []arr = new int[] {2,4,5,7,12,16,17,18};
		System.out.println(getNum(arr, 15));
		
	}

}
