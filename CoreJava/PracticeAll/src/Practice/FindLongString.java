package Practice;

public class FindLongString {
	public static void main(String[] args) {
		System.out.println(longString("abcabcdbbmdiwvj"));
	}
	
	public static String longString(String val) {
		
		StringBuilder maxLen = new StringBuilder();
		for(int i = 0; i<val.length();i++) {
			StringBuilder sb = new StringBuilder();
		
			for(int j = i; j<val.length();j++) {
			String ch = val.substring(j,j+1);
			if(sb.indexOf(ch)>=0) {
				
				break;
			}else {
				sb.append(ch);
			}
		
		}
			maxLen = maxLen.length()<sb.length()?sb:maxLen;
			if(maxLen.length()>=(val.length()-i)) {
				break;
			}
		}
		
		return maxLen.toString();
	}

}
