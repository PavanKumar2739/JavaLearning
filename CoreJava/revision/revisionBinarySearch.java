public int findIndex(int[] arr,int target){
	int s = 0;
	int e = arr.length-1;
	while(s<=e){
		int m = s+(e-s)/2;
		if(arr[m]>target){
			e = m-1;
		}else if(arr[m]<target){
			s = m+1;
		}else{
			return m;
		}
	}
	return -1;
}

public int findPivot((int[] arr,int target){
	int s = 0;
	int e = arr.length-1;
	while(s<=e){
		int m = s+(e-s)/2;
		if(m<e&&arr[m]>arr[m+1]){
			return m;
		}
		else if(m>s&&arr[m-1]>arr[m]){
			return m-1;
		}else{
			if(arr[m]<arr[s]){
				e= m-1;
			}else{
				s = m+1;
			}
		}
	}
}