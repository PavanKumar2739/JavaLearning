package LeetCode;

public class LongestCommonPrx {
	
	    public String longestCommonPrefix(String[] strs) {
	        String prefex = "";
	        int len = 0;
	        String pre = "";
	        if(strs.length<=1){
	            return strs[0];
	        }
	        while(strs[0].length()>len){
	            //if()
	            for(int i =0;i<strs.length-1;i++){
	                
	                if(strs[i].charAt(len) != strs[i+1].charAt(len)){
	                    return prefex;
	                }
	            }
	            prefex += strs[0].charAt(len);
	            len+=1;
	        }
	        return prefex;
	        
	    }
	

}
