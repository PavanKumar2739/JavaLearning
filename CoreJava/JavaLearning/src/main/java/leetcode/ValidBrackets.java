package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidBrackets {
	public static void main(String[] args) {
		String s = "[({(())}[()])]";
		boolean b = true;
		char[] c = s.toCharArray();
		
		List<Character> ch = new ArrayList<Character>();
          for(char c1:c) {
			ch.add(c1);
		}
		if (s.length() % 2 != 0) {
			System.out.println(false);
		}
		int i=0;
		while(i<ch.size()&&b) {
			if(ch.get(i)=='(') {
				int ind=ch.lastIndexOf(')');
				int pre=ch.remove(ind);
				if(pre>0) {
				 ch.remove(i);
				 if(ind==1||isValid(ch, ind).size()==(2)) {
					 b=true;
					
				 }
				 else {
					 b=false;
					 break;
				 }
					 
				}
				else {
					b=false;
					break;
				}
				//ch.add(c[i]);
				
			}
			
			else if(ch.get(i)=='{') {
				int ind=ch.lastIndexOf('}');
				int pre=ch.remove(ch.lastIndexOf('}'));
				if(pre>0) {
				 ch.remove(i);
                 if(isValid(ch, ind).size()==2||ind==1) {
					 b=true;
					
				 }
                 else {
					 b=false;
					 break;
				 }
				}
				else {
					b=false;
					break;
				}
			}
			else if(ch.get(i)=='[') {
				int ind=ch.lastIndexOf(']');
				int pre=ch.remove(ch.lastIndexOf(']'));
				if(pre>0) {
				 ch.remove(i);
                 if(ind==1||isValid(ch, ind).size()==(2)) {
					 b=true;
					 
				 }
                 else {
					 b=false;
					 break;
				 }
				}
				else {
					b=false;
					break;
				}
			}
			else {
				b=false;
				break;
			}
		}
		System.out.println(b);
			
	}
	public static List<Character> isValid(List<Character> ch1,int ind) {
		List<Character> ch=new ArrayList<>();
		List<Character> c=new ArrayList<>();
		for(int i= 0;i<ind-1;i++) {
			ch.add(ch1.get(i));
		}
		
		int i=0;
		boolean b = true;
				
		while(i<ch.size()&b) {
			if(ch.get(i)=='(') {
				if(ch.lastIndexOf(')')>0) {
				c.add(ch.get(ch.lastIndexOf(')')));
				int pre=ch.remove(ch.lastIndexOf(')'));
				if(pre>0) {
				 c.add(ch.get(i));
				 ch.remove(i);
				 
				}
				else {
					b=false;
					break;
				}
				}
				else {
					b=false;
					break;
				}
				//ch.add(c[i]);
				
			}
			
			else if(ch.get(i)=='{') {
				if(ch.lastIndexOf('}')>0) {
					c.add(ch.get(ch.lastIndexOf('}')));
					int pre=ch.remove(ch.lastIndexOf('}'));
					if(pre>0) {
					 c.add(ch.get(i));
					 ch.remove(i);
					 
					}
					else {
						b=false;
						break;
					}
					}
					else {
						b=false;
						break;
					}
			}
			else if(ch.get(i)=='[') {
				if(ch.lastIndexOf(']')>0) {
					c.add(ch.get(ch.lastIndexOf(']')));
					int pre=ch.remove(ch.lastIndexOf(']'));
					if(pre>0) {
					 c.add(ch.get(i));
					 ch.remove(i);
					
					}
					else {
						b=false;
						break;
					}
					}
					else {
						b=false;
						break;
					}
			}
			else {
				b=false;
				break;
			}
			
		}
		return c;
	}
}
	

