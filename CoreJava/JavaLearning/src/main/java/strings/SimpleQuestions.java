package strings;

public class SimpleQuestions {
	public static void main(String[] args) {
		//palindrome or not
		String s = "abcbcbcba";
		System.out.println(isPalindrome(s));
	}
	static boolean isPalindrome(String s) {
		int len = s.length();
		for(int i = 0; i<len/2;i++) {
			if(s.charAt(i)!=s.charAt(len-1-i)) {
				return false;
			}
		}
		return true;
	}

}
