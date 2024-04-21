package streamapi.java;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMap_Probs {
	public static void main(String[] args) {
		//map ex
		List<Integer> list = Arrays.asList(1,3,4,6,5,3,2);
		
		List<Integer> list1 = list.stream().map(i->i+10).collect(Collectors.toList());
		
		System.out.println(list1);
		
		//flat map
		List<Integer> l1 = Arrays.asList(1,2);
		List<Integer> l2 = Arrays.asList(3,4);
		List<Integer> l3 = Arrays.asList(5,6);
		List<Integer> l4 = Arrays.asList(7,8);
		
		List<List<Integer>> allList = Arrays.asList(l1,l2,l3,l4);
		
		List<Integer> fList = allList.stream().flatMap(i->i.stream()).collect(Collectors.toList());
		
		System.out.println(fList);
		
		
		
	}

}
