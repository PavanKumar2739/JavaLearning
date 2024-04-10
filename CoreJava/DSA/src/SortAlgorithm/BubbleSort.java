package SortAlgorithm;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr2[] = {6,3,23,2,5,-121,-9,0};
		long start2 = System.nanoTime();
		Arrays.sort(arr2);
		long end2 = System.nanoTime();  
		System.out.println(Arrays.toString(arr2)+" time taken in execution "+(end2-start2));
		int arr[] = {6,3,23,2,5,-121,-9,0,2,3,2,5,2,5,1,4,1,4,2,14,6,5,7,224,1};
		long start1 = System.nanoTime();
		bubbleSort(arr);
		long end1 = System.nanoTime();   
		System.out.println(Arrays.toString(arr)+" time taken in execution "+(end1-start1));
		
		
	}
	static void bubbleSort(int [] arr) {
		boolean swapped = false;
		//run the steps n-1 times
		for(int i = 0;i<arr.length;i++) {
			swapped = false;
			//for each step, max item will be come at the last respective index
			for(int j = 1;j<arr.length-i;j++) {//what ever is swapped then it will not come back to laast that where the (arr.length-i) work
				//swap if the item similar then the previous item
				if(arr[j]<arr[j-1]) {
					//swap
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
				
			}
			//if we did not swapped wor a perticular value, it means the array is sorted hence stop the program break 
			if(!swapped) {//o(n) complexity
				break;
			}
		}
	}
	
	static void bubbleSwapPrac(int []arr) {
		boolean swapped;
		for(int i = 0; i< arr.length; i++){// it will take care each swap.. how many swaps happen
			swapped = false;
			for(int j =0; j<arr.length-i-1;j++){//here the real scnario happning like the i is the key here to avoid swapping if alrady done.
				if(arr[j]>arr[j+1]){
					 int temp = arr[j+1];
				         arr[j+1] = arr[j];
					 arr[j] = temp;
					 swapped = true;
					 
		}
	
		}
			if(!swapped){
				break;
			}
		}

	}

}
