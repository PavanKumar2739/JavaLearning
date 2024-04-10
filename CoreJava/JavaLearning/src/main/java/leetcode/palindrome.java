package leetcode;

import java.util.List;

public class palindrome {
public static void main(String[] args) {
	  String s=String.valueOf(-10);
      char[] ch=s.toCharArray();
      boolean flag=false;
      //List<Character> c2=ArrayToListConversion();
      for(int i=0;i<ch.length;i++){
    	  System.out.println(ch[i] +" "+ch[ch.length-i-1]);
    	  char c1=ch[i];
    
          if(c1==(ch[ch.length-i-1])) {
             flag=true;
             System.out.println("in ");
          }
          else
        	  flag= false;
      }
      System.out.println(flag);;
}
}
