package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list {
Integer i=10;
int a=10;
	public static void main(String[] args) {
    List a=new ArrayList();
    a.add(77);
    a.add("Pavan");
    a.add('a');
    
    List b=new LinkedList<>();
    b.add(a);
    b.add(10);
    System.out.println(a);
    System.out.println(a.size());
	System.out.println();
	System.out.println();
	System.out.println();
   // int b=10;
    int c =1;
    System.out.println(b);
    int f[] =new int[] {1,2,3};
   System.out.println(f.length); 
   for(int i:f) {
	   System.out.print(i+" ");
   }
   f[1]=0;
   System.out.println("\n"+f[1]);
   puru p1=new puru("other c ", 10);
   System.out.println(p1.asset);;
	}
	

}
