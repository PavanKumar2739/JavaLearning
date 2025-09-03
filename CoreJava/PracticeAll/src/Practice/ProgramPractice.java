package Practice;

import java.util.Arrays;

public class ProgramPractice {
	
	 public static void main(String[] args) {
	        int [] arr = {1,0,2,0,5,7};
	        swapToLast(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	    
	    public static void swapToLast(int [] arr){
	        int lastCt = 0;
	        for(int i =0;i<arr.length;i++){
	            int current = arr[i];
	            if(current == 0){
	                for(int j = i;j<=arr.length-lastCt-1;j++){
	                    int tmp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = tmp;
	                   
	                }
	                lastCt++;
	                
	            }
	        }
	    }
	    //swap zeros to last
	    public static void swapZerosLast(int [] arr) {
	    	int ind = 0;
	    	for(int n:arr ) {
	    		if(n!=0) {
	    			arr[ind++] = n;
	    		}
	    	}
	    	
	    	while(ind<arr.length) {
	    		arr[ind++] = 0;
	    	}
	    }

}
