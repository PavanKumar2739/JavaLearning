package Arrays;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
int[] rows= new int[5];
	
	String [] rows2 = {"20","56","2","7","4"};
	System.out.println(highestNum(rows2));
}
	static String highestNum(String []arr) {
		Arrays.sort(arr,(num1,num2)->
		(num2+num1)
		.compareTo(num1+num2));
		String concat="";
		for(String num:arr) {
			concat+=num;
		}
		return concat;
	}
	
	
	
}
