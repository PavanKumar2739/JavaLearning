package strings;

import java.util.Arrays;

public class Output {
	public static void main(String[] args) {
		System.out.println(56);
		System.out.println(new int[] {1,2,3,4});//this is actually not an address its like a java own created tostring method returns it because we didnt mention how it should looks.
		//to make it pretty 
		System.out.println(Arrays.toString(new int[] {1,2,3,4}));//in this the toString we are calling from the Arrays class
		
		Integer num = new Integer(10);
		System.out.println(num.toString());
	}

}
