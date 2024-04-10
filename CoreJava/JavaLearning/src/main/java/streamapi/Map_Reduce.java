package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Map_Reduce {
	public static void main(String[] args) {
		long start;
		long end;
		
		List<Integer> arry = new ArrayList<>();
		start = System.currentTimeMillis();
		for(int i = 1;i<=20000000;i++) arry.add(i);
		end = System.currentTimeMillis();
		System.out.println("Time took for execution old model: "+(end-start));
		arry.clear();
		start = System.currentTimeMillis();
		IntStream.range(1, 20000000).forEach(i->{
			arry.add(i);
		});
		end = System.currentTimeMillis();
		System.out.println("Time took for execution new model: "+(end-start));
		
       start = System.currentTimeMillis();
		int sum = 0;
		for(int i:arry)
			sum+=i;
		System.out.println("Sum of array"+sum);
		
		end = System.currentTimeMillis();
		
		System.out.println("Time took for execution old model: "+(end-start));
		
		start = System.currentTimeMillis();
		 //sum = 0;
		int sum1 = arry.stream().mapToInt(i->i).sum();
		//int sum2 = arry.stream().parallel().reduce(0, (a,b)->a+b);
		//Optional<Integer> sum3 = arry.stream().reduce(Integer::sum);
		//System.out.println("Sum of array"+sum3.get());
		System.out.println("Sum of array"+sum1);
		end = System.currentTimeMillis();
		
		System.out.println("Time took for execution new approach: "+(end-start));
		
		int max = arry.stream().parallel().reduce(0, (a,b)->a>b?a:b);
		
		System.out.println(max);
		
		start = System.currentTimeMillis();
		
		List<Integer> newList = arry.parallelStream().map(i->i+i).collect(Collectors.toList());
		
		System.out.println("Sum of array"+sum1);
		end = System.currentTimeMillis();
		
		System.out.println("Time took for execution new approach: "+(end-start));
		
		List<Integer> newArr = new ArrayList<>();
		start = System.currentTimeMillis();
		for(int i:arry) newArr.add(i+i);
		System.out.println("Sum of array"+sum1);
		end = System.currentTimeMillis();
		
		System.out.println("Time took for execution old approach: "+(end-start));
		
		
	}

}
