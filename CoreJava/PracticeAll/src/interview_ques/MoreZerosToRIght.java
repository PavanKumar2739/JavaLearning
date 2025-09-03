package interview_ques;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreZerosToRIght {
	
	public static void main(String[] args) {
		
	}
	
	public static void movingZerosToRt(List<Integer> arr) {
		
//		Stream.concat(Arrays.stream(arr).filter(i->i!=0), Arrays.stream(arr).filter(i->i==0)).collect(Collectors.toList()));
		List<Integer> arr1 = Stream.concat(arr.stream().filter(i->i!=0), 
				arr.stream().filter(i->i==0)).collect(Collectors.toList());
		System.out.println(arr1);
	
	}
	
public static void movingZerosToRt(int[] arr) {
		
	//Stream.concat(Arrays.stream(arr).filter(i->i!=0).boxed(), Arrays.stream(arr).filter(i->i==0).boxed()).collect(Collectors.toList()));
		
	
	}

}
