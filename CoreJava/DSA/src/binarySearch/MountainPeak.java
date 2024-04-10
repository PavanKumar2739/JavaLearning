package binarySearch;

public class MountainPeak {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,3,1};
		int target = 3;
		int peakIndex = indexOfpeak(arr);
		int index = indexOfSmall(arr, target, 0, peakIndex);
		if(index!=-1) {
			System.out.println(index); ;
		}
		System.out.println(indexOfSmall(arr, target, peakIndex, arr.length-1));
		
	}
	
	static int indexOfpeak(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int m = start+(end-start)/2;
			if(arr[m]>arr[m+1]) {
				end = m;
			}
			else {
			   start = m+1;
			}
		}
		return start;
	}
	static int indexOfSmall(int []arr,int target,int s, int e) {
		if(arr[s]<arr[e]) {
			while(s<=e) {
			  int m = s+(e-s)/2;
			  if(arr[m]>target) {
				  e = m-1;
			  }
			  else if(arr[m]<target) {
				  s = m+1;
			  }else {
				  return m;
			  }
			}
		}else {
			while(s<=e) {
				  int m = s+(e-s)/2;
				  if(arr[m]>target) {
					  s = m+1;
				  }
				  else if(arr[m]<target) {
					  e = m-1;
				  }else {
					  return m;
				  }
				}
		}
		return -1;
	}
	

}
