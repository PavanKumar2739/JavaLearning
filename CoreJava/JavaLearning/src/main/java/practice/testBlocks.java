package practice;

import java.util.Iterator;

public class testBlocks {
public static int name() {
	try {
		System.out.println(10+20);
		return 200;
	} catch (Exception e) {
		return 300;
	}
	finally {
		return 100;
	}
}
	public static void main(String[] args) {
		System.out.println(name());
		String []s=new String[3];
		s[0]="Exc";
		s[1]="Han";
		int i=0;
		try {
			for(String s1:s) {
				s[i].concat("ele"+i);
				i++;
			}
			for (i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
			
		}
		catch (NullPointerException e) {
			System.out.println("null exc");
		}
	}
}
