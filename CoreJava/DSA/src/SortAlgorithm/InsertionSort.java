package SortAlgorithm;

import java.util.Arrays;

//insertion sort is kind of start with left side and push the lesser value to begining for some portion of the array and try to move one by one.
//below case it will sort in 6,3 ->3,6 and take next 23, soo 3,6,23 next 2, so now 2,3,6,23.... till last
//how its working we can see below insertionSort method checking from back and taking till front if the number is lesser then the before of that number if yes its sort if no it will break. since the arry was partially sorted
//it works good for the array partially sorted. min comparisions o(n) and max is o(n2)
public class InsertionSort {
	public static void main(String[] args) {
		int arr2[] = {6,3,23,2,5,-121,-9,0};
		long start2 = System.nanoTime();
		Arrays.sort(arr2);
		long end2 = System.nanoTime();  
		System.out.println(Arrays.toString(arr2)+" time taken in execution "+(end2-start2));
		int arr[] = {6,3,23,2,5,-121,-9,0,2,3,2,5,2,5,1,4,1,4,2,14,6,5,7,224,1};
		long start1 = System.nanoTime();
		insertionSort(arr);
		long end1 = System.nanoTime();   
		System.out.println(Arrays.toString(arr)+" time taken in execution "+(end1-start1));
		String arrS[] = {"kohli","Yuvi","pavan","kumar","apple"};
		long start3 = System.nanoTime();
		insertionSortString(arrS);
		long end3 = System.nanoTime();   
		System.out.println(Arrays.toString(arrS)+" time taken in execution "+(end3-start3));
		
		
	}
	static void insertionSort(int [] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {//this is where the logic works in that partial array it will check and swap internally
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
		
	}
	static void insertionSortString(String [] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j>0;j--) {
				if(arr[j].compareToIgnoreCase(arr[j-1])<0) {//this is where the logic works in that partial array it will check and swap internally
					String temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
		
	}

}
