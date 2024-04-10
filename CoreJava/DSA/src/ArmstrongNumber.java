
public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println(isArmNum(154));
	}

	static boolean isArmNum(int num) {
		int original= num;
		int sum=0;
	    while(num>0) {
	    	int rem=num%10;
	    	num=num/10;
	    	sum+=Math.pow(rem, 3);
	    }
	    return original==sum;
	    		
	}
}
