package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheetSheet1 {
	
	public static void main(String[] args) {
		
		List<Employee> list = EmployeeDataBase.getAllEmployees();
		
		List<Character> char1 = new ArrayList<>();
		
		List<Employee> filterList  = list.stream().filter(i->i.getName().startsWith("J")).collect(Collectors.toList());
		
		System.out.println(filterList);
		
		Map<String, Long> deptInfo = list.stream().map(i->i.getDept()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(deptInfo);
	
		Employee highestSal = list.stream()
		.sorted(Comparator.comparing(i->i.getSalary(),Collections.reverseOrder()))
		.skip(1)
		.findFirst().orElse(null);
		
		System.out.println("2ed Highest sal " +highestSal);
		
		String lowerCase = "hello";
		
		String upperCase = lowerCase.toUpperCase();
		
		String[] lowerChar = lowerCase.split("");
		
		upperCase = Arrays.stream(lowerChar).map(String::toUpperCase).collect(Collectors.joining(""));
		System.out.println(upperCase);
	}

}
