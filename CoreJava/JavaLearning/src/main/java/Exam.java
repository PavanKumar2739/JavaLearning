import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Exam {
	
	public static void main(String[] args) {
		int []list1 = {2,5,8,34,6,23,86};
		int []list2 = {3,34,17,4,9,12};
		
		int l1Size = list1.length;
		int l2Size = list2.length;
		
		int combineSize = l1Size+l2Size;
		
		
		int [] combine = new int[combineSize];
		int bgList = l1Size>l2Size?l1Size:l2Size;
		int count1 = 0;
		int count2 = bgList;
		
		for(int i = 0;i< bgList;i++) {
			
			if(l1Size>i)combine[count1++] = list1[i];
			if(l2Size>i)combine[count2++] = list2[i];
		}
		System.out.println(Arrays.toString(combine));
		
		List<String> s = new ArrayList<>();
		//s.addAll();
		
		System.out.println();
		
		sorting(combine);
		System.out.println(Arrays.toString(combine));
		
		String [] list3 = {"abc", "cde", "efg", "bcd"};
		String [] list4 = {"xyz", "pqr", "efg", "bcd"};
		
		List<String> l1 = new ArrayList<>(List.of(list3));
		List<String> l2 = new ArrayList<>(List.of(list4));
		l1.removeIf(i->!l2.contains(i));
		
		System.out.println(l1.stream().filter(i->l2.contains(i)).toList());
		System.out.println(l1);
		
		
		
		
		
	}
	public static void sorting(int[] arr) {
		boolean swap = false;
		for(int i = 0;i<arr.length;i++) {
			swap = false;
			for(int j = 0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
	}
	
	

}
