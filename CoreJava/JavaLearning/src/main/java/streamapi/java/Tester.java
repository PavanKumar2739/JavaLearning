package streamapi.java;

import java.util.*;
import java.util.stream.Collectors;

public class Tester {
	public static void main(String[] args) {
		List<Student> listStu = new ArrayList<>();
		listStu.add(new Student(1, "A", 80));
		listStu.add(new Student(2, "B", 90));
		listStu.add(new Student(3, "C", 81));
		listStu.add(new Student(4, "D", 84));
		listStu.add(new Student(5, "F", 70));
		listStu.add(new Student(6, "I", 30));
		listStu.add(new Student(7, "J", 60));
		Map<String,Integer> mapMarks = new LinkedHashMap<>(); 
		
		List<Student> filter = listStu.stream()
				.parallel()
				.map(i->{i.setName(i.getName().toLowerCase()); return i;})
				.sorted((i,j)->(i.getMarks()-j.getMarks()))
				.toList();
		
		List<Student> filter2 = filter.stream().map(i->{i.setName(i.getName().toLowerCase()); return i;}).sorted((i,j)->(i.getName().compareTo(j.getName()))).limit(3).toList();
		
		List<Student> passStu = listStu.stream().filter(i->i.getMarks()>50).toList();
		
		List<Map<String, Integer>> addUpMarksTOPass = listStu
				.stream()
				.filter(i->i.getMarks()<50)
				.map(i->{mapMarks.put(i.getName(), 50-i.getMarks()); return mapMarks; })//since it will just add to the map not returning so we are returning externally
				.toList();
		
		System.out.println(addUpMarksTOPass);
		
		System.out.println(filter);
		System.out.println(passStu);
	}

}
