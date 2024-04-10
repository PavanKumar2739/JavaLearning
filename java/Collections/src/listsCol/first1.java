package listsCol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class first1 {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("pavan");
		li.add("pavan");
		li.add("kumar");
		li.add(25);
		li.add('A');
		li.add(2.6f);
//to store same datatype values
		List <String> li1=new ArrayList<>();
		li1.add("pavan");
		li1.add("pavan");
		li1.add("kumar");
//		li1.add(25);
//		li1.add('A');
//		li1.add(2.6f);
//using itterators
		System.out.println(li);
		System.out.println(li1);

		for(String s:li1) {
			System.out.println(s);
			
		}
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
			
		}
//list itterator
	ListIterator it=li.listIterator();
	System.out.println("forwird : ");
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("reverse : ");
	while(it.hasPrevious()) {
		System.out.println(it.previous());
	}

	System.out.println("for each");
	//using forEach
	li.forEach(a->{
		System.out.println(a);
	});
	
	System.out.println("iterator for each");
	Iterator itr=li.iterator();
	itr.forEachRemaining(a->{
		System.out.println(a);
	});
	}
	
//

}
