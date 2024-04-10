package Exceptions;

public class basic {

	public static void main(String[] args) {
		m1();
	}
	/**
	 * StackTrace
	 * 
	 * Exception name - java.lang.ArithmeticException
	 * Exception message - / by zero
	 * Which line number
	 * Methods info
	 */
	public static void m1() {
		System.out.println("Execution starts");
		
		int a=1;
		int b=0;
		int result = 0;
		try {
		result=a/b;
		}
		
//		}
		catch (ArithmeticException e) {
			System.out.println(e);
			throw e;  
		}
		
		finally {
			System.out.println("finally block");
		}
		System.out.println("output : "+result);
		System.out.println("Execution End");
		
	}

}
