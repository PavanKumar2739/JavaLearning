package binarySearch;

import java.util.Iterator;

public class SplitArrayLargestSum {
	public static void main(String[] args) {
		int arr[]= {7,2,5,10,8};
		System.out.println(splitArray(arr, 2));
		
	}
	 public static int splitArray(int[] nums, int k) {
		 int start = 0;
		 int end = 0;
		 for (int i = 0; i < nums.length; i++) {
			 start = Math.max(start, nums[i]);
			 end += nums[i];
			 
		}
		 //binary search
		 while(start<end) {
			 //try for the middle for potential ans
			 int mid = start+(end-start)/2;
			 
			 //calculate how may pieces you can divide this in with max sum
			 int sum = 0;
			 int pieces = 1;
			 for(int num:nums) {
				 if(sum+num>mid) {
					 //you cannot add this subarray, make new one
					 //say you add this num in new subarray,then sum = num
					 sum = num;
					 pieces++;
				 }else {
					 sum+=num;
				 }
			 }
			 if(pieces>k) {
				 start = mid+1;
			 }else {
				 end = mid;
			 }
		 }
		 return end;
		
	        
	 }

}
