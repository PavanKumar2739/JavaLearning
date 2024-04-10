package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> s= list.stream();
		//filter the list values
		List<Integer> filterList = s.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(filterList);
		
		//modify the list and return
		List<Integer> marks = Arrays.asList(33,55,52,8,90);
		List<Integer> updatedMarks = marks.stream().map(m->m+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		
		//count the final result after filter
		long failStudents = marks.stream().filter(m->m<35).count();
		System.out.println(failStudents);
		
		//by default ascending order
		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		//sort in descending order
		List<Integer> sortedDecList = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(sortedDecList);
		//sort in descending order
		List<Integer> sortedDef = marks.stream().sorted((i1,i2)->-(i1).compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedDef);
		
		//sort the numberwise big number to create a big number in list
		List<String> studentsRoll = Arrays.asList("33","55","52","8","90");
		List<String> sortedString = studentsRoll.stream().sorted((i1,i2)->-(i1+i2).compareTo(i2+i1)).collect(Collectors.toList());
		System.out.println(sortedString);
		
		//filtering depending on the length
		List<String> names = Arrays.asList("Pavan","Pavan Kumar","Yuvi","Kohli");
		List<String> sortedNameIncresingLength = names.stream()
				.sorted((i1,i2)->{
								int leni1 = i1.length();
								int leni2 = i2.length();
								if(leni1<leni2) return -1;
								else if(leni1>leni2) return 1;
								else return 0;
								
			
						          }).collect(Collectors.toList());
		System.out.println(sortedNameIncresingLength);

		//find max and min value using streams
		List<Integer> nums = Arrays.asList(10,8,3,2,0,1);
		int min = nums.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		
		int max = nums.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
		nums.stream().forEach(System.out::print);
		
		//act as the for loop use all time
		nums.stream().forEach(i->{
			double multiple = Math.pow(i, 2);
			System.out.println("the multiple of "+i+" is : "+multiple);
		});
		
		//to convert list to array
		Integer [] arr = nums.stream().toArray(Integer[]::new);
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		Stream.of(arr).forEach(System.out::print);
		
		
		
		
		
	}

}
