package SetInterface;

import java.util.*;

public class hashSetClass {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("pavan");
		s.add("ran");
		s.add("yuvi");
		s.add(20);
		s.add("kumar");
		s.add("pavan");
		System.out.println(s);
		 
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
