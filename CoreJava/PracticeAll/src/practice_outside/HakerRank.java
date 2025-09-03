package practice_outside;

import java.util.*;

public class HakerRank {
	
	public static void main(String[] args) {
		
		//List<String> cavity = cavityMap(List.of("2476387", "1485738", "6591334", "9589583", "6827769","2559498","1822388"));
		List<String> cavity = cavityMap(List.of("9"));
		System.out.println(cavity);
		
	}
	public static List<String> cavityMap(List<String> grid) {
	      if(grid.size()<=1) return grid;
	        List<String> list = new ArrayList<>();
	   // Write your code here
	        list.add(grid.get(0));
	        for(int i = 1;i<grid.size()-1;i++){
	             String num = grid.get(i);
	             char[] st = new char[num.length()];
	             st[0] = num.charAt(0);
	             for(int j =1;j<num.length()-1;j++){
	               char LSide = num.charAt(j-1);
	               char RSide = num.charAt(j+1);
	               String topString = grid.get(i-1);
	               String botString = grid.get(i+1);
	               char top = topString.charAt(j);
	               char bottom = botString.charAt(j);
	               char curr = num.charAt(j);
	               if(curr>LSide && curr>RSide &&curr>top &&curr>bottom){
	                   st[j] = 'X';
	                  
	               }else{
	                   st[j] = curr;
	               }
	             }
	              st[num.length()-1] = num.charAt(num.length()-1);
	              
	              list.add(String.valueOf(st));
	             // System.out.println(list);
	        }
	        list.add(grid.get(grid.size()-1));
	        return list;

	   }

}
