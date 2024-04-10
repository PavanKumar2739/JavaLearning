package Functions_Methods;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		multiple(0, 0, "String","kumar");
		//fun1();//ambiguous
		fun1("pavan");
		
	}
	static void multiple(int a,int b, String ...v) {//variable length should always comes at last
		System.out.println(a+" "+b+Arrays.toString(v));
	}
	//method overloading
	static void fun1(int ...v) {
		System.out.println(Arrays.toString(v));
		
	}
static void fun1(String ...v) {
	System.out.println(Arrays.toString(v));
	}
}
