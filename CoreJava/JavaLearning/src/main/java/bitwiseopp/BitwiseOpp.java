package bitwiseopp;

public class BitwiseOpp {
	public static void main(String[] args) {
		System.out.println("is odd : "+evenOdd(11));
		int [] arr = {1,2,2,1,6,5,5};
		//find unique value
		System.out.println(duplicate(arr));
		
		//find ith bit of a number [1,1,0,0,1,0,1,0 5th digit] 
		int n = 5;
		System.out.println(n|(1<<(n-1)));
		
		
	}
	public static boolean evenOdd(int num) {
		return (num&1) == 1;
	}
	public static int duplicate(int []arr) {
		int ans = 0;
		for(int n:arr) {
			ans ^= n;
		}
		return ans;
	}
	

}
