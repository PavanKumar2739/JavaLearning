package leetcode;

public class substringOfLetters {
	  public static int strStr(String haystack, String needle) {
	        int len1=haystack.length();
	        for(int i=0,j=0;i<len1;i++){
	            int len2=i+needle.length();
	            
	            if(len2<=len1&&haystack.substring(i,len2).equals(needle) ){
	                return i;
	            }
	        }
	        return -1;
	    }
	  public static void main(String[] args) {
		strStr("a","a");
	}
}
