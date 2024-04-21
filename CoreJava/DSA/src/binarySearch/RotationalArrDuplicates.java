package binarySearch;

public class RotationalArrDuplicates {

	//this will not work for duplicate values
	public static void main(String[] args) {
		int []arr = {9,9,9,9,1,2,2};
		int t = 2;
		int maxNumIndex = pivot(arr);
		System.out.println("Pivot "+maxNumIndex);
		System.out.println("elemnt : ");
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
	public static int pivotIndexDuplicates(int [] arr){
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
		   int m = start+(end - start);
		   if(m<end&& arr[m]>arr[m+1]){
			return m;
		}else if(m>start&& arr[m]<arr[m-1]){
			return m-1;
		}else{
		      if(arr[m]==arr[start]&&arr[m]==arr[end]){
			 if(arr[start]>arr[start+1]) return start;
			  start ++;
			 if(arr[end]>arr[end-1]) return end;
			 end--;
		      }
	             else{
			if(arr[start]>arr[m]||(arr[end]==arr[m]&&arr[m]<arr[start])){
			  end = end -1;
			}else {start = start +1;}
		      }
	       }
	    }return -1;
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
			//elements from start and end and middle duplicates the skip the duplicates in all place
			if(arr[m]==arr[start]&&arr[m]==arr[end]) {
				//skip the duplicates
				//note: what if start and end were the pivot [2,3,2,2,2,2,2,1] if start and end and middle is 0;
				//check start is pivot
				if(arr[start]>arr[start+1]) return start;
				start++;
				//check end is piviot
				if(arr[end]<arr[end-1]) return end -1;
				end--;
			}
			//left side is sorted so should be at right
			else if(arr[start]<arr[m]||(arr[start]==arr[m] && arr[m]>arr[end])) {
				start = m+1;
			}else {
				end = m-1;
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
					if(arr[m] == arr[s] && arr[m] == arr[e]) {
						if(arr[s]<arr[s+1]) return s+1;
						s++;
						if(arr[e]<arr[e-1]) return e-1;
						e--;
					}
					else {
					if(arr[m]>arr[s] ||(arr[s]==arr[m] && arr[e]<arr[m])) {
						s = m+1;
					}else {
						e = m-1;
					}
					}
				}
			}
			return -1;
		}

}
