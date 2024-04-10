package StaticNonStatic;

import java.util.Random;

public class Tester1 {
	int num;
	static int num1;
	public static void main(String[] args) {
		Tester1 t1=new Tester1();
		t1.num=10;
		t1.num1=10;

		Tester1 t2=new Tester1();
		t2.num=new Random().nextInt(10, 20);
		t2.num1=10;

		Tester1 t3=new Tester1();
		t3.num=30;
		t3.num1=30;

		
		System.out.println(t1.num);
		System.out.println(t2.num);
		System.out.println(t3.num);
		
		System.out.println(t1.num1);
		System.out.println(t2.num1);
		System.out.println(Tester1.num1);
		

		
		
	}
	

}
