package practice;

import practice.DivisionByZero.Cal;

public class divTest{
	public static void main(String[] args) {
		try {
			int r=Cal.div(20, 0);
			System.out.println("r ;"+r);
		} catch (DivisionByZero e) {
			System.out.println("e : "+e.getMessage());
		}
	}
}
