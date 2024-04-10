package LeetCode;

import java.util.HashMap;

public class RansomNote {
	 public static boolean canConstruct(String ransomNote, String magazine) {
	        int[] alphabet = new int[26];

	        for (char c : ransomNote.toCharArray()) {
	            int index = magazine.indexOf(c, alphabet[(int) c % 26]);
	            if (index == -1) return false;
	            alphabet[(int) c % 26] = index + 1;
	        }

	        return true;
	    }
	 
	 public boolean canConstruct1(String ransomNote, String magazine) {//wrote best approach in subbmissions 
	        int i = 0;
	        int j = 0;
	        HashMap<String,Integer> map = new HashMap<>();
	        int ranLen = ransomNote.length();
	        int magLen = magazine.length();
	        String []ransCh = ransomNote.split("");
	       
	        for(String ch : ransCh){
	             int count  = 0;
	            if(map.containsKey(ch))
	               count = map.get(ch);
	            map.put(ch,count+1);
	        }
	        
	        while(i<ranLen && j<magLen){
	            String ch = String.valueOf(magazine.charAt(j));
	            if(map.containsKey(ch)){
	                int reduceCount = map.get(ch);
	                if(reduceCount-1==0)
	                    map.remove(ch);
	                else
	                  map.put(ch,reduceCount-1);
	                i++;
	            }
	            j++;
	        }
	        return i==ranLen;

	        
	    }
	 public static void main(String[] args) {
		System.out.println(canConstruct("aa", "aab"));
	}

}
