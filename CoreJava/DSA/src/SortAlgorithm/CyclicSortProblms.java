package SortAlgorithm;

import java.util.*;

public class CyclicSortProblms {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDuplicates(arr));
		int[] arrMiss = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(arrMiss));
	}

	// find multiple duplicates in a 1-n numbers
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int i = 0;
		int len = nums.length;
		while (i < len) {
			int index = nums[i] - 1;
			if (index < len && nums[i] != nums[index]) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;

			} else {
				i++;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			if (j + 1 != nums[j]) {
				list.add(nums[j]);
			}
		}
		return list;
	}

	// if the element is missing in the 1-n numbers
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int i = 0;
		int len = nums.length;
		while (i < len) {
			int val = nums[i] - 1;
			if (val < len && nums[i] != nums[val]) {
				int temp = nums[val];
				nums[val] = nums[i];
				nums[i] = temp;
			} else {
				i++;
			}
		}
		// System.out.print(Arrays.toString(nums));
		for (int j = 0; j < len; j++) {
			if (j != nums[j] - 1) {
				list.add(j + 1);
			}
		}
		return list;

	}

	// since it have only one val so no need to be specific map etc, we can resolve
	// with thi simple cyclic sort another better way is
	// checking the values and return if any dupicate came
	public int findDuplicate(int[] nums) {
		int i = 0;
		int len = nums.length;
		while (i < len) {
			if (nums[i] != i + 1) {
				int index = nums[i] - 1;
				if (index < len && nums[i] != nums[index]) {
					int temp = nums[i];
					nums[i] = nums[index];
					nums[index] = temp;
				} else {
					return nums[i];
				}
			} else {
				i++;
			}
		}

		return -1;

	}

	
	// this approach is faster for finding one duplicate you can see why
	public int findDuplicate1(int[] nums) {
		boolean[] saved = new boolean[nums.length + 1];

		for (int num : nums) {
			if (saved[num]) {
				return num;
			} else {
				saved[num] = true;
			}
		}

		return -1;
	}
	

	//You are given an integer array nums representing the data status of this set after the error.
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
	//we sort first and then check which one is not well enough sooo
	//we take that as first and next is the another number with increment
	 public int[] findErrorNums(int[] nums) {
	        int [] list = new int[2];
	        int i =0;
	        int len = nums.length;
	        while(i<len){
	          
	            int index = nums[i]-1;
	            if(nums[i]!=nums[index]){
	                int temp = nums[i];
	                nums[i] = nums[index];
	                nums[index] = temp;
	            }
	            else{
	                i++;
	            }
	        }
	        for(int j = 0;j<len;j++){
	            if(j+1 != nums[j]){
	                list[0] = nums[j];
	                list[1] = j+1;
	            }
	        }
	        return list;
	    }
	 
	 
	 //https://leetcode.com/problems/first-missing-positive/
	 //one of the hard problem missing smallest number in an array
	 public int firstMissingPositive(int[] nums) {
	        int i =0;
	        int len = nums.length;
	        while(i<len){
	            int index = nums[i]-1;
	            if(index>=0 && index<len && nums[i]!=nums[index]){
	                int temp = nums[i];
	                nums[i] = nums[index];
	                nums[index] = temp;
	            }else{
	                i++;
	            }
	        }
	       // System.out.print(Arrays.toString(nums));
	        for(int j = 0;j<len;j++){
	            if(j+1 != nums[j]){
	                return j+1;
	            }
	        }
	        return len+1;
	    }
}
