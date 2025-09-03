package interview_ques;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part1Questions {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 2);
		map.put("B", 3);
		map.put("C", 5);
		map.put("D", 6);
		map.put("E", 2);
		map.put("F", 3);
		map.put("G", 6);
		
		sortMapValues(map);
		
		
		//if you give 7 return 11 if its 11 then 7
		System.out.println(returnByOtherValue(7));
		
		List<Integer> dupL = getDuplicates(List.of(1,3,2,4,5,5,4,3,0));
		System.out.println(dupL);
	}
	
	private static int returnByOtherValue(int i) {
		return 11+7-i;
		
	}

	static void sortMapValues(Map<String,Integer> map) {
		LinkedHashMap<String,Integer> sortedMap = map.entrySet()
				.stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
						(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(sortedMap);
	}
	public static void movingZerosToRt(List<Integer> arr) {
		
//		Stream.concat(Arrays.stream(arr).filter(i->i!=0), Arrays.stream(arr).filter(i->i==0)).collect(Collectors.toList()));
		List<Integer> arr1 = Stream.concat(arr.stream().filter(i->i!=0), 
				arr.stream().filter(i->i==0)).collect(Collectors.toList());
		System.out.println(arr1);
	
	}
	
	//get duplicate values in a list
	public static List<Integer> getDuplicates(List<Integer> values){
				return values.stream().collect(Collectors
						.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getKey())
				.collect(Collectors.toList());
	}

}
