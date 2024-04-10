package conditional_loops;

import java.util.Scanner;

public class ReverseOfTheNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long num=sc.nextLong();
	long rev=0;
	while(num>0) {
		long rem=num%10;
		num/=10;
		rev=rev*10+rem;
	}
	System.out.println(rev);
}
}
