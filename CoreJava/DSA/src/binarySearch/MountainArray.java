package binarySearch;

//difference between mountain array and spinner array
//mountain [2,3,4,5,4,3,1] it dosent care of about the duplicates and the order can be fllowed half assending and half decending
///spinners [2,3,4,5,1] dupicates does matter and the array has numbers in rounded donset have to be mountain
public class MountainArray {
	public static void main(String[] args) {
		int [] arr= {2,3,4,5,4,3,1};
		int i = getPeakIndex(arr);
		System.out.println(arr[i]);
		
	}
	static int getPeakIndex(int[]arr) {// this will only check for mountain arrays increasing and decreasing not for all
		int s = 0;
		int e = arr.length-1;
		while(s<e) {
			int m = s+(e-s)/2;
			System.out.println(m);
			if(arr[m]>arr[m+1]) {
				//this maybe the answer but look at left
				//this is why end !=mid -1
				e = m;
				System.out.println(e);
			}else {
				s = m+1;//because we know that mid+1 is greater then mid then
			}
			//if the value till one element remaining then its a max element if then we can return it 
			
		}
		return s;
	}

}
