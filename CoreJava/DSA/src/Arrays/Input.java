package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] arr = new int[5];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 50;
		arr[3] = 60;
		arr[4] = 12;
		System.out.println(arr[1]);
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
