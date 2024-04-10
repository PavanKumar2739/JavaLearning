package infy;

import java.io.*;
import java.util.*;

public class Exercises {

	public static int logic(int E, List<Integer> list) {

		int count=0;
		int E1=0;
		Collections.sort(list, Collections.reverseOrder());
		for(int i:list) {
			E1=i;
			
			if(E1>=E) {
				count++;
				return count;
			}
		}
		count=0;
		E1=0;
		for(int i=0;i<list.size();i++) {
			
			E1+=list.get(i);
			count++;
			if(E1>=E) {
				return count;
			}
		}
    for(int i=0;i<list.size();i++) {
				E1+=list.get(i);
				count++;
				if(E1>=E) {
					
					return count;
				}
			}
		
		return -1;
		
	}

	public static void main(String[] args) throws java.lang.Exception {
		List<Integer> list = new ArrayList<>();

		Scanner s = new Scanner(System.in);
		int E = s.nextInt();
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			list.add(s.nextInt());
		}

	System.out.println(logic(E, list));	
		
	}
}
