package MapInt;

import java.util.*;

public class HashMapClass {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("name", "pavan");
		hm.put("dob", 20);
		hm.put("add", "udm");
		hm.put(null, 20);
		hm.put(1, 20);
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
