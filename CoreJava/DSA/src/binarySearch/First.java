package binarySearch;

import java.util.Arrays;

public class First {
	public static void main(String[] args) {
		
		int [] arr = {-18,-3,-2,0,2,4,15,16,18,22,45,89};
		int ans = binarySearch(arr, 9);
		System.out.println(ans);
		String arrS[] = {"apple","kohli","kumar","pavan","Yuvi"};
		
		System.out.println(binarySearchString(arrS,"Yuvi"));
		
	}
	
	static int binarySearch(int [] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start<=end) {
		//	int middle = (start+end)/2;// might be possible it will exceed range of integer
			int middle = start+(end-start)/2; 
			if(target<arr[middle]) {
				end = middle -1;
				
			}else if(target > arr[middle]){
				start = middle+1;
			}
			else {
				return middle;
			}
			
		}
		return -1;
	}
	static int binarySearchString(String [] arr, String target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start<=end) {
		//	int middle = (start+end)/2;// might be possible it will exceed range of integer
			int middle = start+(end-start)/2; 
			if(target.compareToIgnoreCase(arr[middle])<0) {
				end = middle -1;
				
			}else if(target.compareToIgnoreCase(arr[middle])>0){
				start = middle+1;
			}
			else {
				return middle;
			}
			
		}
		return -1;
	}

}
