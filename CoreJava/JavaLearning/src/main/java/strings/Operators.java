package strings;

import java.util.ArrayList;

public class Operators {
	public static void main(String[] args) {
		System.out.println('a'+'b');//convert into acii val and print as number sum its for char
		System.out.println("a"+"b");//print ab
		System.out.println('a'+3);//100 but if we cast it we will get actual char
		System.out.println((char)('a'+3));
		System.out.println("a"+1); //a1
		System.out.println("pav"+new ArrayList<>());//pav[]
		System.out.println("a"+'a');//aa
		
	}

}
