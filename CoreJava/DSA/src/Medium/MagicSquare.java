package Medium;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MagicSquare {
	public static int formingMagicSquare(List<List<Integer>> s) {
	    // Write your code here
	    List<Integer> cross=new ArrayList<>();
	    List<Integer> edges=new ArrayList<>();
	    //List<Integer> cross=new ArrayList<>();
	    
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	           int val= s.get(i).get(j);
	        switch (i) {
	            case 0:
	                if(j==1)edges.add(val);
	                else cross.add(val);
	                break;
	            case 1:
	                if(j==1)break;
	                else edges.add(val);
	                break;
	            case 2:
	                if(j==1)edges.add(val);
	                else cross.add(val);
	                break;
	             
	        }
	        }
	    }
	    int sum=0;
	    Map<Integer,Integer> crossMap=new LinkedHashMap<>();
	    crossMap.put(2,8);
	    crossMap.put(4,6);
	    crossMap.put(8,2);
	    crossMap.put(6,4);
	    Map<Integer,Integer> edgeMap=new LinkedHashMap<>();
	    edgeMap.put(1,9);
	    edgeMap.put(3,7);
	    edgeMap.put(9,1);
	    edgeMap.put(7,3);
	    for(int i=0;i<4;i++){
	        if(List.of(2,4,6,8).contains(cross.get(i))){
	        	 
	            continue;
	        }
	        else{
	            switch (i) {
	                case 0 -> sum+=Math.abs(crossMap.get(cross.get(3))-cross.get(0));
	                case 1 -> sum+=Math.abs(crossMap.get(cross.get(2))-cross.get(1));
	                case 2 -> sum+=Math.abs(crossMap.get(cross.get(1))-cross.get(2));
	                case 3 -> sum+=Math.abs(crossMap.get(cross.get(0))-cross.get(3));
	                    
	            }
	        }
	    }
	    for(int i=0;i<4;i++){
	        if(List.of(1,3,7,9).contains(edges.get(i))){
	            continue;
	        }
	        else{
	            switch (i) {
	                case 0 -> sum+=Math.abs(edgeMap.get(edges.get(3))-edges.get(0));
	                case 1 -> sum+=Math.abs(edgeMap.get(edges.get(2))-edges.get(1));
	                case 2 -> sum+=Math.abs(edgeMap.get(edges.get(1))-edges.get(2));
	                case 3 -> sum+=Math.abs(edgeMap.get(edges.get(0))-edges.get(3));
	                    
	            }
	        }
	    }
	    return sum;

	    }
	public static void main(String[] args) {
		
		int val=formingMagicSquare(List.of(List.of(4, 8, 2),List.of(4, 5, 7),List.of(6, 1, 6)));
		System.out.println(val);
	}


}
