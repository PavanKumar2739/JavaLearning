package Functions_Methods;import java.util.ArrayList;
import java.util.Arrays;

public class PassingExample {

	public static void main(String[] args) {
	    String name="pavan";
		greet(name);
		System.out.println(name);// pavan will print
		//create an array
		int [] arr= {1,2,3,4,7};
		change(arr);
		System.out.println(Arrays.toString(arr));
 	}
	static void greet(String name) {
		name = "kumar";//crating the new obj
	}
	static void change(int [] num) {
		num[0]=20;//if we change via refrence variable same object will be changed
	}

}

