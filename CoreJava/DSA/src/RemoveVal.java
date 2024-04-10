import java.util.Arrays;

public class RemoveVal {
	public static void main(String[] args) {
		int [] nums = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums, 2)+" "+Arrays.toString(nums));
		
		
	}
	
	    public static int removeElement(int[] nums, int val) {
	        int count=0;
	        //int[] removed=new n
	        for(int i:nums){
	            if(i==val)
	                continue;
	            else{
	                nums[count]=i;
	               count+=1;
	            }
	        }
	        return count;
	    }
	

}
