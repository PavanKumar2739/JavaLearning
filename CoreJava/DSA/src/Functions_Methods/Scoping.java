package Functions_Methods;

public class Scoping {
	public static void main(String[] args) {
		int a=02;
		
		 System.out.println(a);
	}
	static void method(int a) {
		int b= 20;
		System.out.println(a);
		int c=0;
		{
			c=30;
			int d=0;
		}
		//System.out.println(d);// we cant access outside of the block
		System.out.println(c);
	}

}
