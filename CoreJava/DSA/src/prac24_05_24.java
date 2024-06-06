
public class prac24_05_24 {
	
	public int binarySearch(int [] arr,int t) {
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int m = s+(e-s)/2;
			if(arr[m]>t) {
				e = m-1;
			}else if(arr[m]<t) {
				s = m+1;
			}else {
				return m;
			}
		}
		return -1;
		
	}
	public int findPivot(int [] arr) {
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int m = s+(e-s)/2;
			if(m<e && arr[m]>arr[m-1]) {
				return m;
			}else if(m>s && arr[m]<arr[m-1]) {
				return m-1;
			}else {
				if(arr[m]>arr[s]) {
					s = m+1;
				}else {
					e = m-1;
				}
			}
				
		}
		return s;
	}

}
