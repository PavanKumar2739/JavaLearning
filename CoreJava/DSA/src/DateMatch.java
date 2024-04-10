import java.util.ArrayList;
import java.util.List;

public class DateMatch {
	public static int birthday(List<Integer> s, int d, int m) {
	    // Write your code here
	   List<List<Integer>> sq=new ArrayList<>();
	   int count=0;
	   for(int i=0;i<s.size();i++){
	       List<Integer> list=new ArrayList<>();
	       int sum=0;
	       if(i+m>s.size())break;
	       for(int j=i;j<i+m;j++){
	           int temp=j;
	           if(j>=s.size()) temp=j-s.size();
	            list.add(s.get(temp));
	           sum+=s.get(temp);
	       }
	    if(sum==d){
	       if(!sq.contains(list)){
	           sq.add(list);
	           count++;
	       }
	       }
	        // sum = list.stream()
	        //     .reduce(0, Integer::sum);
	   }
	   return count;
	    

	    }

	public static void main(String[] args) {
		birthday(List.of(1, 2, 1, 3, 2), 3, 2);
	}

}
