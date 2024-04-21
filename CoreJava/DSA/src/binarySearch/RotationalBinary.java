package binarySearch;

public class RotationalBinary {
	
	//this will not work for duplicate values
	public static void main(String[] args) {
		int []arr = {6,7,8,9,10,1,2,3,4,5};
		int t = 3;
		int maxNumIndex1 = pivot(arr);
		System.out.println("peekIndex "+maxNumIndex1);
		int maxNumIndex = MountainArray.getPeakIndex(arr);
		System.out.println("peekIndex "+maxNumIndex);
		if(arr[maxNumIndex] == t)
			System.out.println(maxNumIndex);
		//if we do not find pivot its not rotational so do normal binarysearch
		if(maxNumIndex==-1) {
			int index = valIndex(arr, t, 0, arr.length-1);
			System.out.println(index);
		}
		
		else if(t<=arr[0]) {
			int index = valIndex(arr, t, maxNumIndex+1, arr.length-1);
			System.out.println(index);
		}else {
			int index = valIndex(arr, t, 0, maxNumIndex);
			System.out.println(index);
		}
		
		
	}
	//find the highest number in the array
	static int findPivot(int[] arr) {
		int start = 0;
		int end =  arr.length-1;
		while(start<=end) {
			int m = start+(end-start)/2;
			if(m<end && arr[m]>arr[m+1]) {
				return m;
			}if(m>start && arr[m]<arr[m-1]) {
				return m-1;
			}
			if(arr[m]<=arr[start]) {
				end = m-1;
			}else {
				start=m+1;
			}
		}
		return -1;
	}
	
	 static int valIndex (int [] arr,int t, int s, int e) {
		
			 while(s<=e) {
				 int m = s+(e-s)/2;
				 if(arr[m]>t) {
					 e= m-1;
				 }else if(arr[m]<t) {
					 s = m+1;
				 }else {
					 return m;
				 }
			 }
			 return -1;
		 }
	 
	 public static int findPivotPrac(int[] arr){
			int s = 0;
			int e = arr.length-1;
			while(s<=e){
				int m = s+(e-s)/2;
				if(m<e&&arr[m]>arr[m+1]){
					return m;
				}
				else if(m>s&&arr[m-1]>arr[m]){
					return m-1;
				}else{
					if(arr[m]<arr[s]){
						e = m-1;
					}else{
						s = m+1;
					}
				}
			}
			return s;
		}
	 public static int getPivot2(int [] arr){
			int s = 0;
			int e = arr.length-1;
			while(s<=e){
				int m = s+(e-s)/2;
				if(m<e&&arr[m]>arr[m+1]){
					return m;
				}else if(m>s && arr[m]<arr[m-1]){
					return m-1;
				}else{
					if(arr[s]<arr[m]){
						s = m+1;
					}else{
						e = m-1;
					}
				}
				
			}
			return -1;
		}
	 
	 public static int pivot(int [] arr) {
			int s = 0;
			int e = arr.length-1;
			while(s<=e) {
				int m = s+(e-s)/2;
				if(m<e&&arr[m]>arr[m+1]) {
					return m;
				}
				else if(m>s && arr[m-1]>arr[m]) {
					return m-1;
				}else {
					if(arr[m]>arr[s]) {
						s = m+1;
					}else {
						e = m-1;
					}
				}
			}
			return -1;
		}



}
