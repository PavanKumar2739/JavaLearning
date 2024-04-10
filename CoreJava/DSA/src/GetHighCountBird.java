
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GetHighCountBird {
	public static int migratoryBirds(List<Integer> arr) {
	    // Write your code here
	    Map<Integer,Integer> typeVal=new LinkedHashMap<>();
	    typeVal.put(1,0);
	    typeVal.put(2,0);
	    typeVal.put(3,0);
	    typeVal.put(4,0);
	    typeVal.put(5,0);
	    
	    arr.forEach(bird->{
	        switch(bird){
	            case 1:
	                typeVal.put(1,typeVal.get(1)+1);
	               
	                break;
	            case 2:
	                typeVal.put(2,typeVal.get(2)+1);
	                break;
	            case 3:
	                typeVal.put(3,typeVal.get(3)+1);
	                break;
	            case 4:
	                typeVal.put(4,typeVal.get(4)+1);
	                break;
	            case 5:
	                 typeVal.put(5,typeVal.get(5)+1);
	                break;
	        }
	    });
	    int key=0;
	    int value=0;
	    for(java.util.Map.Entry<Integer, Integer> val:typeVal.entrySet()){
	        if(value<val.getValue()){
	            value=val.getValue();
	            key=val.getKey();
	        }
	        // value=val.getValue()>value?val.getValue():val;
	    }
	return key;
	    }
}
