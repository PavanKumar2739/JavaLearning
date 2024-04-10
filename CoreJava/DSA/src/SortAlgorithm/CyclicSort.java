package SortAlgorithm;

import java.util.Arrays;
import java.util.*;

//its works for only continuous arrys 
public class CyclicSort {
	public static void main(String[] args) {
		int [] arr = {4,5,2,1,3};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
		
	}
	static void sort(int [] arr) {
		int i = 0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(i != correct) {// the value which is going to swap and index value is same it will not work
				swap(arr,i,correct);
			}else {// increment when the correct and current index position is not same
				i++;
			}
		}
	}
	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
	}
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> list = new ArrayList<>();
	        int i = 0;
	        int len = nums.length;
	        while(i<len){
	            int val = nums[i]-1;
	            if(val<len&&nums[i]!=nums[val]){//with duplicates we must need to use this
	                int temp = nums[val];
	                nums[val] = nums[i];
	                nums[i] = temp;
	            }else{
	                i++;
	            }
	        }
	        System.out.print(Arrays.toString(nums));
	        for(int j = 0;j<len;j++){
	            if(j!=nums[j]-1){
	                list.add(j+1);
	            }
	        }
	        return list;
	        
	    }

}
