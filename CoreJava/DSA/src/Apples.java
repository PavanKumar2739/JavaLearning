import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Apples {
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
	    // Write your code here
	    List<Integer> treesDist=new ArrayList<>();
	    treesDist.add(a);
	    treesDist.add(b);
	    List<List<Integer>> appOr=List.of(apples,oranges);
	    List<List<Integer>>filterDist=new ArrayList<>();
	    for(int i=0;i<appOr.size();i++) {

	    	int tD=treesDist.get(i);
	    	filterDist.add(appOr.get(i).stream()
			.map(dist->tD+dist).collect(Collectors.toList()));
	    }
	    
	    //sams house space
	    for(List<Integer> IntStream:filterDist) {
	    	List<Integer> list= IntStream.stream().filter(dist->(dist>=s&&dist<=t))
	  
	      .collect(Collectors.toList());
	      System.out.println(list.size());
	    
	    }
	    }

public static void main(String[] args) {
	countApplesAndOranges(7, 11, 5, 15, List.of(-2, 2, 1), List.of(5 ,-6));
}
}
