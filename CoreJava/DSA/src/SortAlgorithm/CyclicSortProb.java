package SortAlgorithm;

import java.util.*;

public class CyclicSortProb {
	public static void main(String[] args) {
		System.out.println(permutationEquation(new ArrayList<>(List.of(2,3,1))));
		
	}
	  public static List<Integer> permutationEquation(List<Integer> p) {
		    // Write your code here
		    List<Integer> list = new ArrayList<>();
		    Map<Integer,Integer> map = new HashMap<>();
		    int i = 0;
		    int len = p.size();
		   while(len>i){
		       int index = p.get(i)-1;
		        map.put(i, p.get(i));
		       if(i != index){
		           
		           int temp = p.get(i);
		           p.set(i,p.get(index));
		           p.set(index, temp);
		          
		        }else{
		           
		           i++;
		        }
		   }
		   System.out.println(map);
		    return p;

		    }
		    

		


}
