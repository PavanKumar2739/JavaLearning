package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Tester {

	public static void main(String[] args) {
		Student [] arr = {
				new Student(1,20,"A"),
				new Student(2,30,"C"),
				new Student(3,10,"B"),
		};
		
		Comparator<Student> stuMarks = Comparator.comparing(s->s.getMarks());
		
		Arrays.sort(arr,stuMarks.reversed());
		
		   
	}
}
