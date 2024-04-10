package infy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock;

public class ClosestElements {
	public static int minNum(List<Integer>list) {
		List<Integer> list1=new ArrayList<>();
		for(int i:list) {
			list1.add(i);
		}
		Collections.sort(list1);
		return list1.get(0);
	}
	public static List<Integer> logic(int len,int num,List<Integer> list) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> finList=new ArrayList<>();
		for(int i:list) {
			int n1=i-num;
			int n2=Math.abs(n1);
			
			list1.add(n2);	
		}
		int minNum=minNum(list1);
		
		int ind=list1.indexOf(minNum);
		System.out.println(ind);
		System.out.println("near : "+list.get(ind));
		int pov=1;
		int nev=1;
		int num1=0;
		int num2=0;
		while(finList.size()<len) {
			if(finList.size()==0)
			   finList.add(list.get(ind));
			int posve=ind+pov;
			int negve=ind-nev;
			if(posve<list.size())
			   num1=list1.get(posve);
			if(negve>=0)
			   num2=list1.get(negve);
			if(num1==num2&&negve>=0) {
				finList.add(list.get(negve));
				nev++;
			}
			else if(num1>num2 &&negve>=0 ) {
				finList.add(list.get(negve));
				nev++;
			}
			else if(posve<list.size()){
				finList.add(list.get(posve));
				pov++;
			}
		
			
		}
		Collections.sort(finList);
		return finList;
		
	}

	public static void main(String[] args) {
		  
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int num=s.nextInt();
        String listNum=s.next();
        List<Integer> list=new ArrayList<>();
        String[] arr=listNum.split(",");
        for(int i=0;i<arr.length;i++) {
        	list.add(Integer.parseInt(arr[i].trim()));
        }
        
        System.out.println(logic(len, num, list));
    }

	

}
