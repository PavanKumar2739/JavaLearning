package StaticNonStatic;

public class Tester2 {
	static int num1;
	static {

		System.out.println("static method1");
		num1=10;
	}
	static {

		System.out.println("static method2");	
	}
	
	
	{
		System.out.println("non-static method");
		
	}
	public Tester2()
	{
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		/*if we call here static num1 variable it will show 0, because in 
		here not initialized in this variable so tester2.num1 is 0*/
		//by creating obj we can access pass the variables or method in this class
		//for static by class name is enough to pass the variable and initialize it
		System.out.println("main method");
		Tester2 t1=new Tester2();
		Tester2 t2=new Tester2();
		Tester2 t3=new Tester2();
		Tester2 t4=new Tester2();
		Tester2 t5=new Tester2();
		
	}

}
