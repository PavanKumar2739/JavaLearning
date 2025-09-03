package Practice;

import java.util.Arrays;

public class FindIndex {
	
	public static void main(String[] args) {
		int [] arr = {7,3,4,2,6,1};
		
		int [] mergeArr = Sorting.mergeSort(arr);
		int [] arr1 = {19,32,1,31,6};
		int [] left =  Sorting.mergeSort(arr);
		int [] right = Sorting.mergeSort(arr1);
		int [] merSort = Sorting.merge(left,right);
		System.out.println(Arrays.toString(merSort));
		
		int ind = findInd2(merSort,31);
		
		int [] mount = {1,3,4,5,7,4,1};
		
		int indPeek = findPeek(mount);
		
		System.out.println("Peek:"+indPeek);
		
		System.out.println("Find ind : "+ind);
	}
	
	public static int findIndex(int [] arr,int tar) {
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int m = s+(e-s)/2;
			if(arr[m]>tar) {
				e = m-1;
			}else if(arr[m]<tar) {
				s = m+1;
			}else {
				return m;
			}
		}
		return -1;
	}
	
	public static int findPeek(int []arr) {
		int s =0;
		int e = arr.length-1;
		while(s<e) {
			int m = s+(e-s)/2;
			if(arr[m]>arr[m+1]) {
				e = m;
			}
			else {
				s = m+1;
			}
		}
		return s;
	}
	
	public static int findInd2(int [] arr,int t) {
		int i = 0;
		int j = arr.length-1;
		while(i<=j) {
			int k = i+(j-i)/2;
			if(arr[k]>t) {
				j = k-1;
			}else if(arr[k]<t) {
				i = k;
			}else {
				return k;
			}
		}
		return -1;
	}

}
