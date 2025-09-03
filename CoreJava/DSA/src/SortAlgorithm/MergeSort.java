package SortAlgorithm;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int arr[] = {6,3,23,2,5,-121,-9,0,2,3,2,5,2,5,1,4,1,4,2,14,6,5,7,224,1};
		mergeSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] arr,int s,int e) {
		
		if(e-s==1) return;
		
		int m = ((e+s))/2;
		
		mergeSort(arr, s, m);
		mergeSort(arr, m, e);
	
	    merge(arr,s,m,e);
	}
	
	private static int [] mergeSort1(int [] arr) {
		if(arr.length == 1) return arr;
		
		int m = arr.length/2;
		
		int[] left = mergeSort1(Arrays.copyOfRange(arr, 0,m));
		int[] right = mergeSort1(Arrays.copyOfRange(arr, m,arr.length));
		return merge1(left, right);
	}
	
	private static int[] merge1(int [] left,int [] right) {
		int [] mix = new int[left.length+right.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<left.length && j<right.length) {
			if(i<left.length || j<right.length) {
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

	private static void merge(int[] arr, int s, int m, int e) {
		int [] mix = new int[e-s];
		int i = s;
		int j = m;
		int k = 0;
		while(i<m || j<e) {
			if(i<m && j<e) {
				if(arr[i]>arr[j]) {
					mix[k] = arr[j];
					j++;
				}else {
					mix[k] = arr[i];
					i++;
				}
			}else {
				if(j<e) {
					mix[k] = arr[j];
					j++;
				}else {
					mix[k] = arr[i];
					i++;
				}
			}
			k++;
		}
		
		for(int p =0;p<mix.length;p++) {
			arr[p+s] = mix[p];
		}
		
	}

}
