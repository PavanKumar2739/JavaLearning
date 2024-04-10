import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxNum {
	public static void miniMaxSum(List<Integer> arr) {
        
	    // Write your code here
	    List<Long> list=new ArrayList<>();
	    int count=0;
	    while(count!=arr.size()){
	        long sum=0;
	        for(int i=0;i<arr.size();i++){
	            if(count==i)continue;
	            sum+=arr.get(i);
	        }
	        list.add(sum);
	        count++;
	    }
	    Collections.sort(list);
	    System.out.print(list.get(0)+" "+list.get(list.size()-1));

	    }
public static void main(String[] args) {
	miniMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625
));
	
}
}
