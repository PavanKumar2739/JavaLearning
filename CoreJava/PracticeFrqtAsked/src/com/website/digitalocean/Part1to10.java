package com.website.digitalocean;

import java.util.Iterator;

public class Part1to10 {
	
	public static void main(String[] args) {
		String rvs = reverse("pavan");
		System.out.println(rvs);//navap
		
		//swapping numbers
		swapWitout3edVar(1, 4);
		//output : before swap , a = 1, b = 4
		//after swap , a = 4, b = 1
		
		//3 approaches for the find if vowels
		System.out.println(stringContainsVowels("Pspkq1"));
		System.out.println(stContainsVowels("Pspkq1a"));
		System.out.println(stContainsVowelsCharApproach("Pspkq1"));
		
		//given number is prime or not
		System.out.println("Given numer is Prime ; "+primeNumberCheck(73));
		
		//fibnocci numbers
		System.out.println("fib ");
		fiboncci(30);
		
	}
	
	//
	public static String reverse(String s) {
		
		if (s == null)
			   throw new IllegalArgumentException("Null is not valid input");

		 
		String [] ch = s.split("");
		StringBuilder sb = new StringBuilder();
		
		for(int i = ch.length-1; i>=0; i--) {
			sb.append(ch[i]);
		}
		
		
		return sb.toString();
	}
	
	//swap the numbers without the third variable
	public static void swapWitout3edVar(int a, int b) {
		
		System.out.println("before swap , a = "+a+", b = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swap , a = "+a+", b = "+b);
		
	}
	
	//hard way to find the vowels
	public static boolean stringContainsVowels(String st) {
		String [] vowels = {"a","e","i","o","u"};
		String lowerSt = st.toLowerCase();
 		for(int i = 0; i<vowels.length; i++) {
 			if(lowerSt.contains(vowels[i])) {
 				return true;
 			}
 		}
 		return false;
		
		
	}
	
	//one line code to find if the vowel is there in string
	//should not over use of regex its hevier
	public static boolean stContainsVowels(String st) {
		return st.toLowerCase().matches(".*[aeiou].*");
	}
	
	
	public static boolean stContainsVowelsCharApproach(String st) {
		
		st = st.toLowerCase();
		for(char ch : st.toCharArray()) {
			if("aeiou".indexOf(ch) != -1) {
				return true;
			}
			
		}
		return false;
	
	}
	
	//check prime number or not
	public static boolean primeNumberCheck(int num) {
		if(num == 1 || num == 2) return true;
		
		int num1 = num/2;
		
		for(int i = 2; i<num1;i++) {
			if(num%i==0) return false;
		}
		
		return true;
		
	}
	
	public static void fiboncci(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		for(int i = 0;i<n;i++) {
			System.out.println(a+" ");
			a = b;
			b = c;
			c = a+b;
		}
		
	}

}
