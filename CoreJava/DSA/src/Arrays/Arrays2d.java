package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2d {
	public static void main(String[] args) {
		int [][] arr = new int[3][];
		int [][] arr2d= {
				{1,2,3},{1,2},{4,5,6,7}
		};
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arr1 = new int[3][2];
		
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println(arr1[i][j]);
			}
		}
		for(int [] ar:arr1) {
			System.out.println(Arrays.toString(ar));
		}
		
	}

}
