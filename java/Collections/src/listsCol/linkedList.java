package listsCol;

import java.util.*;
public class linkedList {
	

	public static void main(String[] args) {
		
	LinkedList<student> l=new LinkedList<>();
	student s1=new student(10,"pavan","ud");
	
     l.add(s1);
     l.add(new student(20));//we can use this type also
     
     Iterator it=l.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	}

}
