package bitwiseopp;

public class NoOfDigits {
	public static void main(String[] args) {
		int n = 10;
		int b = 2;
		
		int ans = (int)(Math.log(n)/Math.log(b))+1;
		System.out.println(ans);
	}
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
	public int findPivot(int []arr) {
		int s = 0;
		int e = arr.length -1;
		while(s<=e) {
			int m = s+(e-s)/2;
			if(m<e && arr[m]>arr[m+1]) {
				return m;
			}else if(m>s && arr[m-1]>arr[m]) {
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
	
	public int findPivotRotation(int []arr) {
		int s = 0;
		int e = arr.length -1;
		while(s<=e) {
			int m = s+(e-s)/2;
			if(m<e && arr[m]>arr[m+1]) {
				return m;
			}else if(m>s && arr[m-1]>arr[m]) {
				return m-1;
			}else {
				if(arr[m]==arr[s] || arr[m]==arr[e]) {
					if(arr[s]>arr[s+1]) return s;
					s++;
					if(arr[e]>arr[e-1]) return e;
					e--;
				}else {
					if(arr[m]<arr[e] ||(arr[m]==arr[s]&&arr[m]<arr[e])) {
						s = m+1;
					}else {
						e = m-1;
					}
				}
			}
		}
			return s;
	}
		

}
