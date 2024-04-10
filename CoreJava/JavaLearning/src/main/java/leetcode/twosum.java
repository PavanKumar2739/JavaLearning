package leetcode;

import java.util.Arrays;

public class twosum {
public static void main(String[] args) {
	int target=6;
	int[] nums=new int[] {3,2,4};
	  int a=0;
      int b=0;
      int [] list=new int[2];
      int j=0;
      while(a!=target &&j!=nums.length-1){
          
          for(int i=j+1;i<nums.length;i++){
              a=nums[i] + nums[j];
              if(a==target){
                  list[0]=j;
                  list[1]=i;
                  System.out.println(Arrays.toString(list)); 
              }
              
             
          }
          j++;
      }
      System.out.println(Arrays.toString(list)); ;
}
}
