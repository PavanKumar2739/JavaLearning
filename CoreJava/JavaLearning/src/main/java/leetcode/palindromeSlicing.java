package leetcode;

import java.util.ArrayList;
import java.util.List;

public class palindromeSlicing {

	public static void main(String[] args) {
		//String s="xyxale mnnm zpx";
		String s="xyx";
		
		char [] c1=s.toCharArray();
		List<Character>  c=new ArrayList<Character>();
		for(int i=0;i<c1.length;i++) {
		if(c1[i]!=' ')
			c.add(c1[i]);
		}
		
		List<Character> list=new ArrayList<Character>();
		int maxLen = 3;
		int count=0;
		System.out.println(c);
		while(c.size()>=maxLen) {
			int l=0;
			boolean  flag=true;
		   for(int i=maxLen;i<=c.size();i++) {
			  for(int j=l;j<maxLen+l;j++)
			  {
				 list.add(c.get(j));
				
			  }
			  for(int k=0;k<list.size();k++) {
				  if(list.get(k).equals(list.get(list.size()-1-k))) {
					  flag=true;
					 continue;
					 
				 }
				  else
				   flag = false;
				  break;
				 }
				 if(flag) {
					 int div=list.size()/2;
					 count+=div;
				 }
			  list.clear();
			  l++;
		}
		  maxLen++;
	}
		System.out.println(count);
	}
}
