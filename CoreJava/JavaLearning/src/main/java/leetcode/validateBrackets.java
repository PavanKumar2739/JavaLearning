package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class validateBrackets {
	public static void main(String[] args) {
		String s = "[({(())}[()])]";
		boolean b = false;
		char[] c = s.toCharArray();
		List<Character> ch = new ArrayList<Character>();
		if (s.length() % 2 != 0) {
			System.out.println(false);
		}

for(int i=0;i<c.length/2;i++){
    	
    	if(c[i]=='('&&c[c.length-1-i]==')'){
            b=true;
        }
         else if(c[i]=='['&&c[c.length-1-i]==']'){
            b=true;
        }
         else if(c[i]=='{'&&c[c.length-1-i]=='}'){
            b=true;
        }
         else
         {
        	 b=false;
        	 break;
         }
}
//}
//   if(!b) {
//    for(int i=0;i<c.length-1;i++){
//          if(c[i]=='('&&c[i+1]==')'){
//            b=true;
//        }
//         else if(c[i]=='['&&c[1+i]==']'){
//            b=true;
//        }
//         else if(c[i]=='{'&&c[1+i]=='}'){
//            b=true;
//        }
//       
//        else if(b) {
//        	b=false;
//           continue;
//        }
//        else
//           System.out.println(false); 
//
//    }
		for (char i : c) {
			ch.add(i);
		}
		int ind=-1;
		if (!b) {
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < ch.size() - 1; i++) {
				if (ch.lastIndexOf(')') != -1 && ch.get(i) == '(' && (ch.lastIndexOf(')') - i) % 2 != 0
						&& !list.contains(i)) {
					ind=ch.lastIndexOf(')');
					list.add(ind);
					ch.set(ind, (char) (33 + i));
				if(isValid(ch, i, ind)) {
					 b = true;
					}
				}

				else if (ch.lastIndexOf('}') != -1 && ch.get(i) == '{' && (ch.lastIndexOf('}') - i) % 2 != 0
						&& !list.contains(i)) {
					ind=ch.lastIndexOf('}');
					list.add(ind);
					ch.set(ind, (char) (33 + i));
					if(isValid(ch, i, ind)) {
					   b = true;
					}
				}

				else if (ch.lastIndexOf(']') != -1 && ch.get(i) == '[' && (ch.lastIndexOf(']') - i) % 2 != 0
						&& !list.contains(i)) {
					ind=ch.lastIndexOf(']');
					list.add(ind);
					ch.set(ind, (char) (33 + i));
					if(isValid(ch, i, ind)) {
					   b = true;
					}
				} else if (!list.contains(i)) {
					b = false;
					break;
				}
			}

		}
		System.out.println(b);
	}

	public static boolean isValid(List<Character> ch1, int i, int last) {
		boolean b = false;
		int ind=-1;
		List<Integer> list = new LinkedList<>();
		List<Character> ch = new ArrayList<Character>();
		for (int j = i+1; j < last; j++) {
			ch.add(ch1.get(j));
		}
		if((last-i) == 1) {
			return true;
		}
		if ((last-i) % 2 == 0) {
			return false;
		}

		for (int j = i; j < last-1; j++) {
			if (ch.lastIndexOf(')') != -1 && ch.get(j) == '(' && (ch.lastIndexOf(')') - j) % 2 != 0
					&& !list.contains(j)) {
				ind=ch.lastIndexOf(')')+i+1;
				list.add(ind);
				ch1.set(ind, (char) (33 + j));
				if(isValid(ch,  j,  ind))
				   b = true;
			}

			else if (ch.lastIndexOf('}') != -1 && ch.get(j) == '{' && (ch.lastIndexOf('}') - j) % 2 != 0
					&& !list.contains(j)) {
				ind=ch.lastIndexOf('}')+i+1;
				list.add(ind);
				ch1.set(ind, (char) (33 + j));
				if(isValid(ch,  j,  ind))
				   b = true;
			}

			else if (ch.lastIndexOf(']') != -1 && ch.get(j) == '[' && (ch.lastIndexOf(']') - j) % 2 != 0
					&& !list.contains(j)) {
				ind=ch.lastIndexOf(']')+i+1;
				list.add(ind);
				ch1.set(ind, (char) (33 + j));
				if(isValid(ch,  j,  ind))
				  b = true;
			} else if (!list.contains(j)) {
				b = false;
				break;
			}
		}

		return b;
	}

}
