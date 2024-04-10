package infy;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LandOfOz {
	public static int logic(int noPple,List<Integer> list) {
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			int pple=list.get(i);
			if(pple>=noPple) {
				count++;
			}
			else {
				int rePple=noPple-pple;
				noPple=rePple;
				count++;
				i--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
	
		List<Integer> pple=new ArrayList<>();
		List<Integer> list=new ArrayList<>();
		//List<List<Integer>> capList=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		int testCases=s.nextInt();
		for(int i=0;i<testCases;i++) {
			//pple.add(s.nextInt());
			int p=s.nextInt();
			list.clear();
			for(int k=0;k<4;k++) {
				list.add(s.nextInt());
			
		}
		System.out.println(logic(p, list));	
			
			//capList.add(list);
		
			
		}
		
//		System.out.println(capList);
//		System.out.println(pple);
		

	}

}
