package recursions;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {-18,-3,-2,0,2,4,15,16,18,22,45,89};
		int ans = findIndex(arr, 89,0,arr.length-1);
		System.out.println(ans);
	}
	
	public static int findIndex(int [] arr,int t, int s, int e) {
		if(s>e) return -1;
		
		int m = s+(e-s)/2;
		if(arr[m]==t) {
			return m;
		}
		//when ever we have return type just return recursive function as well
		if(arr[m]>t) {
		   return findIndex(arr, t, s, m-1);
			}
		   return  findIndex(arr, t, m+1, e);
		 
		
	}
}
