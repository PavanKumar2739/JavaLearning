package MapInt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCl {
	public static void main(String[] args) {
		TreeMap hm = new TreeMap();
		hm.put("name", "pavan");
		hm.put("dob", 20);
		hm.put("add", "udm");
		hm.put("gend", 'M');
		//hm.put(null, 20);
		//hm.put(1, 20);
System.out.println(hm);
//removing key value
     //hm.remove(null);
     System.out.println(hm);
//get perticular key value data
     System.out.println(hm.get("dob"));
//get size
     System.out.println(hm.size());
//is empty or not check
     System.out.println(hm.isEmpty());
     // hm.clear();
 
    Set s=hm.keySet();
    Iterator it =s.iterator();
    while(it.hasNext()) {
    	Object ob=it.next();
    	System.out.println(ob+ " : " +hm.get(ob));
    }
    
	}


}
