package recursionsLeetCode;

public class StepsToReduce {
	public static void main(String[] args) {
		
	}
	 public int numberOfSteps(int num) {
	        return helper(num,0);
	 }
	private int helper(int num, int count) {
		// TODO Auto-generated method stub
	if(num == 0) return count;
	
	if(num%10 == 0) return helper(num/2, ++count);
	return helper(num-1, ++count);
	}

}
