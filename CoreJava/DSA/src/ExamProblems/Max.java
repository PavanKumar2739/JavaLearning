package ExamProblems;

import java.util.*;

public class Max {
	public static int maxSubstring(String S,String ch){
		//this is default OUTPUT. You can change it.
		int result = -404;
		int count = 0;
		int temp = 0;
		List<Integer> list = new ArrayList<>();
		//write your Logic here:
		for(int i = 0;i<S.length();i++){
		if(S.substring(i,i+1).equals(ch)){
		count++;
		}else{
		if(count>temp) temp = count;
		count = 0;
		}
		}
//		Collections.sort(list);
//		int len = list.size();
		if(temp==0 && count == 0) return result;
		else if(temp<count) return count;
	
		result = temp;
	
		return result;
		}
	public static void main(String[] args) {
		
		System.out.println(maxSubstring("hetttuuu", "u"));
	}
}
