package conditional_loops;

import java.util.ArrayList;
import java.util.List;

public class maxVal {
	public static void plusMinus(List<Integer> arr) {
        
	    // Write your code here
	    double neg=0;
	    double pos=0;
	    double z=0;
	    for(int num:arr){
	        if(num<0){
	            neg+=1;
	        }
	        else if(num>0){
	            pos+=1;
	        }
	        else{z+=1;}
	    }
	    List<Double> list=new ArrayList<>();
	    list.add(neg);
	    list.add(pos);
	    list.add(z);
	    List<Double> list1=new ArrayList<>();
	    while(list.size()>0){
	        int index=0;
	        double max=list.get(0);
	        for(int i=0;i<list.size();i++){
	            max=Math.max(max,list.get(i));
	            if(list.get(i)>list.get(index)) 
	            	index=i;
	        }
	        list1.add(max);
	        list.remove(index);
	    }
	    for(double val:list1){if(val>0)System.out.println(val/arr.size());}

	    }

	public static void main(String[] args) {
		plusMinus(List.of(-100, 100, 0, 0, 0, -100, 100, 0, -100, 100, 100, 0, 0, 0, 0, -100, -100, -100, 0, -100, 0, 100, 100, -100, -100, 100, 100, 100, 100, -100, -100, -100, -100, 100, 0, 0, 100, 0, 0, -100, -100, -100, -100, -100, -100, 100, 100, 0, 100, 100, -100, -100, -100, 0, 100, -100, 0, 100, 100, -100, 100, -100, 0, -100, -100, 100, 0, 0, -100, 0, -100, -100, 100, -100, 100, 0, 100, -100, -100, -100, 100, 100, 100, 100, 0, -100, 0, 100, 100, 100, 0, -100, -100, 0, 0, 100, 0, -100, 100, 100));
	}

}
