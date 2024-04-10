package StaticMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class collectionStaticMethods {
	 public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(1);
		al.add(13);
		al.add(4);
		al.add(64);
		System.out.println("Before sort : "+al);

		Collections.sort(al);
		System.out.println("After sort : "+al);
		
		Collections.reverse(al);
		System.out.println("reverse sort : "+al);
		
		Collections.swap(al, 1, 3);
		System.out.println("after swap sort : "+al);
		
		System.out.println("after swap sort : "+Collections.max(al));
        
		System.out.println("after swap sort : "+Collections.min(al));

	}

}
