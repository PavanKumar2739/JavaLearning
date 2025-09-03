package LeetCode;

import java.util.Arrays;

public class Problems {

	public static void main(String[] args) {
		int [] arr = {4,3,2,7,3,1};
		int [] rot = rotate(arr, 2);
		
	//	System.out.println(Arrays.toString(rot));
		
		int[] numbers = {1, 4, 20, 3, 10, 5};
		int count = subarray(numbers, 33);
		System.out.println(count);
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
	
	public static int subarray(int [] arr, int target) {
		int left = 0;
		int right = 0;
		int curr = 0;
		int count = 0;
		while(right<arr.length && left<arr.length) {
			while(right<arr.length && curr<target) {
				curr +=arr[right++];
			}
			if(curr==target) {
				System.out.println(left+" "+right);
				right++;
				count++;
			}
			while(left<arr.length && curr>target) {
				curr -=arr[left++];
			}
			if(curr==target) {
				System.out.println(left+" "+right);
				right++;
				count++;
			}
		}
		return count;
		
	}
}
