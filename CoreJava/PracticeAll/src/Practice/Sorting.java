package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
	
	public static void main(String[] args) {
		int [] arr = {7,3,4,2,6,1};
		//bubbleSort(arr);
		//insertionSort(arr);
		
		int [] mergeArr = mergeSort1(arr);
//		int [] arr1 = {19,32,1,31,6};
//		int [] left =  mergeSort(arr);
//		int [] right = mergeSort(arr1);
//		int [] merSort = merge(left,right);
		System.out.println(Arrays.toString(mergeArr));
//		cyclicSort(arr);
//		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void bubbleSort(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			boolean swap = false;
			for(int j = 1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
					swap = true;
				}
				
			}
			if(!swap) break;
		}
	}
	
	public static void insertionSort(int [] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}else {
					break;
				}
			}
		}
	}
	
	public static int[] mergeSort(int [] arr) {
		if(arr.length == 1 ) {
			return arr;
		}
		int m = arr.length/2;
		int [] left =  mergeSort(Arrays.copyOfRange(arr, 0, m));
		int [] right = mergeSort(Arrays.copyOfRange(arr, m, arr.length));
		
		return merge(left,right);
	}

	public static int[] merge(int[] left, int[] right) {
		int [] mix = new int[left.length+right.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<left.length || j<right.length) {
			if(i<left.length && j<right.length) {
				if(left[i]<right[j]) {
					mix[k] = left[i];
					i++;
				}else {
					mix[k] = right[j];
					j++;
				}
			}else {
				if(i<left.length) {
					mix[k] = left[i];
					i++;
				}else {
					mix[k] = right[j];
					j++;
				}
			}
			k++;
		}
		return mix;
	}

	
	public static void cyclicSort(int [] arr) {
		List<Integer> noPos = new ArrayList<>();
		for(int i = 0;i<arr.length;) {
			int ind = arr[i]-1;
			if(ind<arr.length&&i!=ind) {
				int tmp = arr[ind];
				arr[ind] = arr[i];
				arr[i] = tmp;
				
			}else {
				
				i++;
			}
		}
		for(int j = 0;j<arr.length;j++){//which position is not proper
            if(j!=arr[j]-1){
            	noPos.add(j+1);
            }
        }
		System.out.println(noPos);
	}
	
	//---14/06/25---
	public static int [] mergeSort1(int [] arr) {
		if(arr.length == 1) {
			return arr;
		}
		int m = arr.length/2;
		
		int [] left = mergeSort1(Arrays.copyOfRange(arr, 0, m));
		int [] right = mergeSort1(Arrays.copyOfRange(arr, m, arr.length));
		
		return merge1(left,right);
	}
	
	public static int[] merge1(int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;
		int [] mix = new int[left.length+right.length];
		
		while(i<left.length || j<right.length) {
			if(i<left.length && j<right.length) {
				if(left[i]<right[j]) {
					mix[k] = left[i];
					i++;
				}else {
					mix[k] = right[j];
					j++;
				}
			}else {
				if(i<left.length) {
					mix[k] = left[i];
					i++;
				}else {
					mix[k] = right[j];
					j++;
				}
			}
			k++;
		}
		return mix;
	}
	
	public static void insertion(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}else {
					break;
				}
			}
		}
	}
}

