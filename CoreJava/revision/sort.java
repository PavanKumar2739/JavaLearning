public void bubbleSort(int []arr){
	int i = 0;
	int len = arr.length-1;
	boolean swp =false;
for(int i =0;i<len;i++){
		swp =false;
	for(int j =0;j<len-i-1;j++){
	
		if(arr[j]>arr[j+1]){
			int temp = arr[i];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
			swp = true;
			
		}
	}
	if(!swp){
		break;
	}
}
}

public void insertionSort(int [] arr){
	for(int i = 0;i<arr.length;i++){
		for(int j =i+1;j>0;j--){
			if(arr[j]<arr[j-1]){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}else{
				break;//because we are sorting from the starting so we can break if one is also not matching
			}
		}
	}
}