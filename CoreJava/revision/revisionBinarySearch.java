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

public int findPivot(int[] arr,int target){
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

public int findPivot(int[] arr,int target){
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
			if(arr[s]==arr[m]&&arr[e]==arr[m]){
				if(arr[s]>arr[s+1]) return s;
				s++;
				if(arr[e]<arr[e-1]) return e-1;
			}
			if(arr[s]<arr[m]||(arr[s]==arr[m]&&arr[m]>arr[e])){//[2,2,2,2,3,3,3] this is not rotated one
				s= m+1;
			}else{
				e = m-1;
			}
		}
	}
}

------------------------------------- days 11- 04-2024-----------------------------------

public int getIndex(int [] arr, int t){
	int s = 0;
	int e = arr.length-1;
	while(s<=e){
		int m = s+(e-s)/2;
		if(arr[m]>t){
			e = m-1;
		}
		else if(arr[m]<t){
			s = m+1;
		}else{
			return m;
		}
	}
	return -1;
}

public int getPivot(int [] arr){
	int s = 0;
	int e = arr.length-1;
	while(s<=e){
		int m = s+(e-s)/2;
		if(m<e&&arr[m]>arr[m+1]){
			return m;
		}else if(m>s && arr[m]<arr[m-1]){
			return m-1;
		}else{
			if(arr[s]<arr[m]){
				s = m+1;
			}else{
				e = m-1;
			}
		}
		
	}
}
public int getPivot(int [] arr){
	int s = 0;
	int e = arr.length-1;
	while(s<=e){
		int m = s+(e-s)/2;
		if(m<e&&arr[m]>arr[m+1]){
			return m;
		}else if(m>s && arr[m]<arr[m-1]){
			return m-1;
		}else{
			if(arr[m] == arr[e] && arr[m] == arr[s]){
				if(arr[s]>arr[s+1]) return s;
				s++;
				if(arr[e]>arr[e-1]) return e;
				e--;
			}
			if(arr[s]<arr[m] || (arr[m] == arr[e] && arr[m] > arr[e])){
				s = m+1;
			}else{
				e = m-1;
			}
		}
		
	}
}

//-------------------------------------13 - 04 - 2024 -------------------------------

public int findIndex2(int [] arr , int t){
	int s = 0;
	int e = arr.length -1;
	while(s<=e){
		int m = s+(e-s)/2;
		if(arr[m]>t){
			e = m -1;
		}else if(arr[m]<t){
			s = m+1;
		}else return m;
	}
	return -1;
}

public int getPivot1(int []arr){
	int s = 0;
	int e = arr.length -1;
	while(s<=e){
		int m = s+(e-s)/2;
		if(m<e&&arr[m]>arr[m+1]){
			return m;
		}else if(m>s&& arr[m-1]>arr[m]){
			return m-1;
		}else{
			if(arr[m]>arr[s]){
				s = m+1;
			}else e = m-1;
		}
	}
}

//duplicates 

public int getPivotDuplicates(int []arr){
	int s = 0;
	int e = arr.length -1;
	while(s<=e){
		if()
	}
}

