package Functions_Methods;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//if we want to do sum 10 time we cant do same right
		//sum();
		System.out.println(sum2(1, 2)); ;
		
	}
	static void sum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int num2=sc.nextInt();
		
		System.out.println("the sum is "+(num1+num2));
		
		
	}
	static void greeting() {
		System.out.println("Hello world!!");
	}
	//return value 
	static int sum1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int num2=sc.nextInt();
		
		return num1+num2;
		
		
	}
	static int sum2(int a,int b) {
		return a+b;
	}

}
