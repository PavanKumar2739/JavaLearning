package simpleProbs;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfItems {
	public static void main(String[] args) {
		List<String> k = new ArrayList<>();
		k.add("item1");
		k.add("item2");
		k.add("item3");
		k.add("item1");
		k.add("item3");
		//System.out.println(k);
		List<String> s = new ArrayList<>();
		for(int i = k.size()-1;i>0;i--) {
			if(s.contains(k.get(i))) {
				continue;
			}
			s.add(k.get(i));
			if(s.size()==3){
				System.out.println(s);
			}
		}
	}

}
