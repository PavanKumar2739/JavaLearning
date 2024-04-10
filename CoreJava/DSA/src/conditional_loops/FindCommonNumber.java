package conditional_loops;

import java.util.Scanner;

public class FindCommonNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int commonNumber=sc.nextInt();
		int numCount=0;
		while(num>0) {
			int rem=num%10;
			num/=10;
			if(rem==commonNumber)numCount++;
		}
		System.out.println(numCount);
	}

}
