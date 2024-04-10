package Arrays;

import java.util.Arrays;

public class Maximum {
	public static void main(String[] args) {
		int [] arr = {1,3,33,7,9};
		System.out.println(max(arr));
	}
	public static int max(int [] arr) {
		if(arr.length==0)return -1;
		int max =arr[0];
		for(int a:arr) {
			max=a>max?a:max;
		}
		
		return max;
	}

}
