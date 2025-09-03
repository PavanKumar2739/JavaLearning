package leetcode;

import java.util.Arrays;

public class RotateArrK {

	public static void main(String[] args) {
		int [] arr = {4,3,2,7,3,1};
		int [] rot = rotate(arr, 2);
		
		System.out.println(Arrays.toString(rot));
	}
	
	public static int[] rotate(int [] arr, int k) {
		int len = arr.length;
		int [] revArr = new int[len];
		for(int i = 0;i<arr.length;i++) {
			int n = (i+k)%len;
			revArr[n] = arr[i];
		}
		return revArr;
	}
}
