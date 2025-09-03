package SortAlgorithm;

import java.util.Arrays;

public class SortingPrac {
	
	public static void main(String[] args) {
		int arr[] = {6,3,23,2,5,-121,-9,0,2,3,2,5,2,5,1,4,1,4,2,14,6,5,7,224,1};
		//sortArr(arr);
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sortArr(int[] arr) {
		Boolean swap = false;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					swap = true;
				}
			}
			if (!swap)
				break;

			swap = false;
		}

	}
	
	public static void insertionSort(int arr []) {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}else {
					break;
				}
			}
		}
	}

}
