package recursions;

public class NumbersExample {
	public static void main(String[] args) {
		//print numbers write a function that takes and prints it
		//print first 5 numbers 
		
		print1(1);
	}

	private static void print1(int i) {
		System.out.println(i);
		print2(2);
		
	}
	private static void print2(int i) {
		System.out.println(i);
		print3(3);
		
	}
	private static void print3(int i) {
		System.out.println(i);
		print4(4);
		
	}
	private static void print4(int i) {
		System.out.println(i);
		print5(5);
		
	}
	private static void print5(int i) {
		System.out.println(i);
		
	}

}
