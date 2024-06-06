package binarySearch;

public class PracticeBinary {
	
	public static void main(String[] args) {
		int [] arr = {1,2,4,5,7,8};
		System.out.println(indexVal(arr, 8));
		int []arr1 = {6,1,2,3,4,5};
		int t = 3;
		int maxNumIndex1 = pivotVal(arr1);
		System.out.println("peekIndex "+maxNumIndex1);
		int []arr2 = {9,1,2,9};
		//int t = 2;
		int maxNumIndex = pivotDuplicates(arr2);
		System.out.println("Pivot "+maxNumIndex);

	}
	
	public static int indexVal(int[] val, int t){
		int s = 0;
		int e = val.length-1;
		while(s<=e) {
			int m = s+(e-s)/2;
			if(val[m]>t) {
				e= m-1;
			}else if(val[m]<t) {
				s = m+1;
			}else return m;
		}
		return -1;
	}
	public static int pivotVal(int []arr) {
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int m = s+(e-s)/2;
			if(m<e && arr[m]>arr[m+1]) {
				return m;
			}else if(m>s && arr[m-1]>arr[m]) {
				return m-1;
			}
			
			else {
				if(arr[m]>arr[s]) {
					s = m+1;
				}else {
					e = m-1;
				}
			}
		}
		return -1;
	}
	
	public static int pivotDuplicates(int []arr) {
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int m = s+(e-s)/2;
			if(m<e && arr[m]>arr[m+1]) {
				return m;
			}else if(m>s && arr[m-1]>arr[m]) {
				return m-1;
			}
			
			else {
				if(arr[m]==arr[s]&&arr[m]==arr[e]) {
					if(arr[s]>arr[s+1]) {
						return s;
					}
					s++;
					if(arr[e]>arr[e-1]) return e;
					e++;
				}else {
					if(arr[s]>arr[m]||(arr[m]==arr[e]&&arr[m]<arr[s])) e = m-1;
					else s = m+1;
				}
			}
		}
		return -1;
	}


}
