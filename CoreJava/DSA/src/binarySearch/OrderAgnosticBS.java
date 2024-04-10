package binarySearch;

public class OrderAgnosticBS {
	public static void main(String[] args) {
		int [] arr = {-18,-3,-2,0,2,4,15,16,18,22,45,89};
		int [] arr2 = {98,43,33,12,12,11,4,2,1};
		int ans = orderAgnosticBS(arr2, 12);
		System.out.println(ans);
		
	}
	static int orderAgnosticBS(int [] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		//find weather the array is sorted in ascending or decending order
		boolean isAsc = (arr[start]<arr[end]);
		
		while(start<=end) {
		//	int middle = (start+end)/2;// might be possible it will exceed range of integer
			int middle = start+(end-start)/2; 
			
			if(target==arr[middle])return middle;
			if(isAsc) {
			if(target<arr[middle]) {
				end = middle -1;
				
			}else{
				start = middle+1;
			}
	
			}else {
				if(target>arr[middle]) {
					end = middle -1;
					
				}else {
					start = middle+1;
				}
			
			}
			
		}
		return -1;
	}
	

}
