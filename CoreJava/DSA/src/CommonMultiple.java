import java.util.Collections;
import java.util.*;

public class CommonMultiple {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
	    Collections.sort(b);
	    int range= b.get(b.size()-1)/2;
	    
	    List<List<Integer>> listVal=new ArrayList<>();
	    for(int val:a){
	        int multiple=0;
	        List<Integer> list=new ArrayList<>();
	    while(range>=multiple){
	        multiple+=val;
	        list.add(multiple);
	    }
	        listVal.add(list);
	    }
	    for(int val:b){
	        
	        List<Integer> list=new ArrayList<>();
	    for(int i=2;range>=i;i++){
	       if(val%i==0){
	           list.add(i);
	       }
	    }
	        listVal.add(list);
	    }
	    for(int i=0;i<listVal.size()-1;i++){
	        listVal.get(0).retainAll(listVal.get(i+1));
	        
	    }
	    System.out.println(listVal);
	    return listVal.get(0).size();
	    }


}
