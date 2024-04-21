package strings;

import java.util.Arrays;

public class Methods {
	public static void main(String[] args) {
		String name = "Pavan Kumar";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		//keep remember that we are not doing anyting to the original object of an string obj
		//its just creating new one by doing this operations
		System.out.print("   pav kumar  l  ".trim());
		System.out.print("  pav kumar  l ".strip());//both work same way
		System.out.println(Arrays.toString(name.split(" ")));
	}  

}
