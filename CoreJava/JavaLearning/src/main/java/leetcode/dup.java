package leetcode;

public class dup {
public static void main(String[] args) {
	int[] nums = new int[] {3,2,2,3};
	int val=3;
	  int count=0;
     // int[] removed=new n
      for(int i:nums){
          if(i==val)
              continue;
          else
             count+=1;
      }
      System.out.println(count); ;
  }
}
