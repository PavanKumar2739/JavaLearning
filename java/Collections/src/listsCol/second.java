package listsCol;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class second {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("pavan");
		li.add("pavan");
		li.add("kumar");
		li.add(25);
		li.add('A');
		li.add(2.6f);
		li.add(1,10);
		
//to store same datatype values
		
		List <String> li1=new ArrayList<>();
		li1.add("charan");
		li1.add("chanda");
		li1.add("Pavan");
		li1.add("kumar");
		
//		li1.addAll(li);
//		li1.addAll(1,li);
		System.out.println(li1.size());
		
//		li1.add(25);
//		li1.add('A');
//		li1.add(2.6f);
//using itterators
		for(Object i:li1) {
			System.out.println(i);
		}
		System.out.println(li);
		System.out.println(li1);
		
//checking equal or nt both lists
		System.out.println(li.equals(li1));
		//li1.clear();
//empty method
		System.out.println(li1.isEmpty());
		
//last index ofS
       System.out.println(li.lastIndexOf("pavan"));
       System.out.println(li.indexOf("pavan"));
//contans or not check

       System.out.println("contains :");
       System.out.println(li.contains("pavan"));
       
  //remove
       System.out.println(li.remove(2));
       System.out.println(li.remove("pavan"));
       System.out.println(li);
 //remove all
//       li1.removeAll(li);
//       System.out.println(li1);
       
       li.set(1, "yadav");
       System.out.println(li);
       
 //sorting the elements order
       li1.sort(String.CASE_INSENSITIVE_ORDER);
       System.out.println(li1);
       li1.sort(Comparator.naturalOrder());
       System.out.println(li1);

//subliat
       System.out.println(li.subList(1, 5 ));
	}
}
