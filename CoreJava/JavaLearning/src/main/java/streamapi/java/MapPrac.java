package streamapi.java;

import java.util.Arrays;

public class MapPrac {
	public static void main(String[] args) {
		int [] arr = {2,3,4,5,4,6,3,64,63,2};
		int sum = Arrays.stream(arr).sum();
		int sum2 = Arrays.stream(arr).filter(i->i<10).sum();
		
	}

}
