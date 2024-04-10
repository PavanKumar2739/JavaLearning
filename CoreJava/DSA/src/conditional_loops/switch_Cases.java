package conditional_loops;

import java.util.Scanner;

public class switch_Cases {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fruit = sc.next();
		switch(fruit) {
		  case "Mango" -> System.out.println("King of fruit");
			
		  case "Apple" -> System.out.println("a fav fruit");
			 
		  case "Orange"->System.out.println("round fruit");
	
		  default -> System.out.println("invalid fruit"); 
		}
	}
}
