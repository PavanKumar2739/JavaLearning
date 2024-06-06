package reccursionArrays;

import java.util.ArrayList;
import java.util.List;

public class FindValue {
	public static void main(String[] args) {
		int [] arr = {1,3,53,13,5,5,6};
		System.out.println(getIndex(arr, 5, 0));
		
		System.out.println(getIndexLast(arr, 5, arr.length-1));

		getAllIndex(arr, 5, 0);
		System.out.println(list );
	}
	static int getIndex(int[] arr, int target,int index) {
		if(arr.length-1==index) return -1;
		if(arr[index]==target) return index;
		
		return getIndex(arr, target, index+1);
	}
	static int getIndexLast(int[] arr, int target,int index) {
		if(index<0) return -1;
		if(arr[index]==target) return index;
		
		return getIndexLast(arr, target, index-1);
	}
	
	static List<Integer> list = new ArrayList<>();
	static void getAllIndex(int[] arr, int target,int index) {
		if(arr.length-1==index) return;
		if(arr[index]==target) list.add(index);
		
		 getAllIndex(arr, target, index+1);
	}
	
	static void getAllIndex(int[] arr, int target,int index,List<Integer> list) {
		if(arr.length-1==index) return;
		if(arr[index]==target) list.add(index);
		
		 getAllIndex(arr, target, index+1);
	}


}
