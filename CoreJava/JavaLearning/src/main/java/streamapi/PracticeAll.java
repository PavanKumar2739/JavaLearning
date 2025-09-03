package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeAll {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(3,2,5,2,6,9));
		Map<Boolean, List<Integer>> list2 = list.stream().collect(Collectors.partitioningBy(i->i%2 == 0));
		
		System.out.println(list2);
	}

}
