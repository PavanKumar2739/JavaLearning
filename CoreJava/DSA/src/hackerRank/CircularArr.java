package hackerRank;

import java.util.*;

public class CircularArr {
	
	public static void main(String[] args) {
		circularArrayRotation(null, 0, null);
		
	}
	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
	    // Write your code here
	   // System.out.println(a+" "+k+" "+queries);
	    // while(k>0){
	    //     for(int i =a.size()-1;i>0;i--){
	    //         int temp = a.get(i);
	    //         a.set(i, a.get(i-1));
	    //         a.set(i-1, temp);
	    //     }
	    //     k--;
	    // }
	    //System.out.println(a);
	    int len = a.size();
	    k = k%len;
	    //avoid checking multiple times rotation if the size is same it will rotate complete one time and positions will be same so the above case will be effective.
	    
	    List<Integer> list = new ArrayList<>();
	    for(int i:queries){
	        int k1 = k;
	        int ind = (len+i-k1)%len;
	        // %len will work if in case the len ind is same size as the list.
	       //k will helps to say rotations and i will the current index 
	        list.add(a.get(ind)) ;
	        }
	    return list;
	    }

	

}
