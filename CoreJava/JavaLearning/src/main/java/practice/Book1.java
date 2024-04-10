package practice;

import java.util.ArrayList;
import java.util.List;

public class Book1 extends book {
	
	public Book1(int x) {
		
		s+="e2";
	}
		public Book1() {
			this(7);
			s+="e";
		}
		public void p(List l) {
			l.add(007);
			//`return 0;
		}
		public static void main(String[] args) {
			System.out.println(s);
			String s="pp";
			String a="p";
			String b="p";
			String c=a.concat(b);
			System.out.println(s==c);
			List lost=new ArrayList();
			Book1 b1=new Book1();
		b1.p(lost);
			System.out.println(lost.get(0));
			System.out.println();
		}
		static {
			Book1 b=new Book1()
;
			System.out.println(s);
		}
	
}
