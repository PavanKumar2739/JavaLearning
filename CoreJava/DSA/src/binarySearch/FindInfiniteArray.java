package binarySearch;

public class FindInfiniteArray {
	public static void main(String[] args) {
		int [] arr= {1,4,5,6,7,8,9,12,13,15,17,18,20,23,26,28,29,33,35,60,67,68,69,80};
		int target = 23;
		int [] startEnd = findStartEnd(arr, target);
		int start = startEnd[0];
		int end = startEnd[1];
		int index = indexNo(arr, target, start, end);
		System.out.println(index);
		
	}
	public static int indexNo(int[]arr,int target,int s, int e) {
		while(s<=e) {
			int m = s+(e-s)/2;
			if(arr[m]>target) {
				e = m-1;
			}else if(arr[m]<target) {
				s = m+1;
			}else {
				return m;
			}
		}
		return -1;
		
		
	}
	public static int[] findStartEnd(int []arr,int target) {
		int start = 0;
		int end =1;
		int count = 2;
		while(arr[end]<target) {
		
			
		
			count*=count;
		    start = end+1;
		    end = count+start;
		    
		
		}
		return new int[] {start,end};
	}

}
