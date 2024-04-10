package searching;

import java.util.Arrays;

public class SearchInStrings {
	public static void main(String[] args) {
		String name = "pavan pKumar";
		char targ = 'u';
		System.out.println(search(name, targ));
		System.out.println(search1(name));
		System.out.println(Arrays.toString(name.toCharArray()));
		
	}
	static boolean search(String str, char targ) {
		if(str.length() == 0)return false;
		
		for(int i = 0; i<str.length();i++) {
			if(targ == str.charAt(i)) {
				return true;
			}
					
	}
	return false;
	}
	
	static boolean search2(String str, char targ) {
		if(str.length() == 0)return false;
		
		
			for(char arr : str.toCharArray()) {
				if(targ==arr)
				return true;
			
					
	}
	return false;
	}
	
	static int search1(String str) {
		for(int i = 0; i<str.length();i++) {
		if(i==str.lastIndexOf(str.charAt(i))){
			return i;
		}
		}
		return -1;

	}
}
