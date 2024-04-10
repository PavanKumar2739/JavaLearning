package listsCol;

import java.util.*;

public class StackClass {

	public static void main(String[] args) {
		Stack s =new Stack();
		s.push(2);

		s.add(1); 
		s.add(10);
		s.add(0,30);
		System.out.println(s);
		s.push(30);
				//System.out.println(s.pop());
		System.out.println(s.search(1));
		System.out.println(s.empty());
		System.out.println(s);

	}
}
