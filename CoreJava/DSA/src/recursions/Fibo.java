package recursions;

import java.util.LinkedHashSet;
import java.util.Set;

public class Fibo {
	static Set<Integer> list = new LinkedHashSet<>();
	public static void main(String[] args) {
		
		System.out.println(fibo(7));
		System.out.println(list);
		
	}
	static int fibo(int n) {
		//base condition
		if(n<2) {
			list.add(n);
			return n;
		}
		int fib = fibo(n-1) + fibo(n-2);
		list.add(fib);
		//System.out.println(fib);
		return fib;
	}

}
