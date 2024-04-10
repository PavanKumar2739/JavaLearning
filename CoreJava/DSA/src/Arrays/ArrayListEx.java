package Arrays;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(10);
		array.add(20);
		array.add(40);
		array.add(10);
		array.add(20);
		array.add(40);
		
		System.out.println(array);
		array.set(0, 1);
		System.out.println(array);
		array.remove(2);
		System.out.println(array);
		
		System.out.println(array.get(0));
		
	}

}
