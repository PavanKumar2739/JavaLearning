package conditional_loops;

import java.util.Scanner;

public class Fibnochi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;int b=1;int temp=0;
		int num=sc.nextInt();
		for(int i=2;i<num;i++) {//0,1,1,2,
			temp=a+b;
			a=b;
			b=temp;
		}
		System.out.println(b);
	}

}
