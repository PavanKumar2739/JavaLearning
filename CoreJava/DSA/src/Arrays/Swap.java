package Arrays;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int [] arr = {1,3,343,5,7,9,54,97,3,10};
		//swap(arr,3,4);
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void swap(int[]a,int index,int index2) {
		int temp = a[index];
		a[index] = a[index2];
		a[index2] = temp;
		
	}
	public static void reverse(int[]a) {
		int start = 0;
		int end = a.length-1;
		while(start<end) {
			
			swap(a,start,end);
			start+=1;
			end-=1;
		}
	}
	

}
