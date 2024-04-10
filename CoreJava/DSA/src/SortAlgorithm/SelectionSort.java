package SortAlgorithm;

import java.util.Arrays;

//this algorithm time complexity is o(n2) kind of more time taking then the bubble sort
//this algorithm for less no of vals in a list.
// find max val first in algorithm and swap it to last index to max val index. with max val and in place of max val index we keep the last index val.
public class SelectionSort {
	public static void main(String[] args) {
		int arr2[] = {6,3,23,2,5,-121,-9,0};
		long start2 = System.nanoTime();
		Arrays.sort(arr2);
		long end2 = System.nanoTime();  
		System.out.println(Arrays.toString(arr2)+" time taken in execution "+(end2-start2));
		int arr[] = {6,3,23,2,5,-121,-9,0,2,3,2,5,2,5,1,4,1,4,2,14,6,5,7,224,1};
		long start1 = System.nanoTime();
		sortArray(arr);
		long end1 = System.nanoTime();   
		System.out.println(Arrays.toString(arr)+" time taken in execution "+(end1-start1));
		
	}
	
	public static void sortArray(int[] arr) {
		
		
		for(int i =0;i<arr.length;i++) {
			int max = arr[0];
			int index = 0;
			//find the max val and in the loop
			for(int j = 0;j<arr.length-i;j++) {
				if(max<arr[j]) {
					max = arr[j];
					index = j;
			
				}
				
			}
			//take the max val and swap it to last 
			arr[index] = arr[arr.length-i-1];
			arr[arr.length-i-1]=max;
		}
	}

}
