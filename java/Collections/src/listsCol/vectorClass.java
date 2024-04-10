package listsCol;

import java.util.*;
public class vectorClass {

	public static void main(String[] args) {
//by default 10 capacity
		
		Vector v1=new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(1);
		v1.add(2);
		v1.add(1);
		v1.add(2);
		v1.add(1);
		v1.add(2);
		v1.add(1);
		v1.add(2);
		v1.add(1);
		v1.add(2);
		v1.add(1);
		v1.add(2);
		v1.add(1);
		v1.add(2);
		System.out.println(v1.capacity());
//here we can assign what we need		
		Vector v=new Vector(5,2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		v.add(1);
		v.add(2);
		System.out.println(v.capacity());
		
	}
}
