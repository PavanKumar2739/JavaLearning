import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeStreams {
	
	public static void main(String[] args) {
				
				//seperate odd and even numbers
				List<Integer> list = new ArrayList<>(List.of(3,2,5,2,6,9));
				Map<Boolean, List<Integer>> list2 = list.stream().collect(Collectors.partitioningBy(i->i%2 == 0));
				
				System.out.println(list2);//{false=[3, 5, 9], true=[2, 2, 6]}
				
				//
				List<String> inputString = new ArrayList<>(List.of("pavan","kumar","hi"));
				Map<Character, Long> ch = "pavan".chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				System.out.println(ch);//{p=1, a=2, v=1, n=1}
				
				//print sorted reverse order
				inputString.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
				
				//multiples of 2
				list.stream().filter(i->(i%2== 0)).forEach(System.out::println);
				
				List<Integer> intStream = new ArrayList<>();
				
				//
				int [] arr1 = {2,1,4,3,1};
				int [] arr2 = {6,2,6,8,0,4};
				
				IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
				
				//
				List<Integer> listConcat = new ArrayList<>(List.of(2,1,4,3,1));
				list.addAll(listConcat);
				
				
//				 
				
				
	}

}
