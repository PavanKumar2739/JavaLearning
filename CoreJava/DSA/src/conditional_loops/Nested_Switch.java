package conditional_loops;

import java.util.Scanner;

public class Nested_Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int empID=sc.nextInt();
		String dep=sc.next();
		switch (empID) {
		case 1: {
			System.out.println("good emp");
			break;
			
		}
		case 2:
			System.out.println("bad emp");
		    break;
		case 3:
			switch (dep) {
			case "Mech": {
				System.out.println("bad dep");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}
	}

}
