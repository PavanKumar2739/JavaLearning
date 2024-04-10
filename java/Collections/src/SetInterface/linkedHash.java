package SetInterface;

import java.util.*;

public class linkedHash {
	public static void main(String[] args) {
		
	
	Set ls=new LinkedHashSet();
	ls.add("pavan");
	ls.add("ran");
	ls.add("yuvi");
	ls.add(20);
	ls.add("kumar");
	ls.add("pavan");
	System.out.println(ls);
	 
	Iterator it=ls.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	TreeSet ts=new TreeSet();
	ts.add("pavan");
	ts.add("ran");
	ts.add("yuvi");
    ts.add("Yadav");
	ts.add("kumar");
	ts.add("pavan");
	System.out.println(ts);
	System.out.println("first: "+ts.first());
	System.out.println("Last: "+ts.last());

   TreeSet t=(TreeSet) ts.headSet("ran");
   System.out.println("head Set: "+t);

   TreeSet t1=(TreeSet) ts.tailSet("ran");
   System.out.println("tail set: "+t1);
	 

   TreeSet t2=(TreeSet) ts.subSet("ran","yadav");
   System.out.println("subSet values: "+t2);
	Iterator it1=ts.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	}
}
