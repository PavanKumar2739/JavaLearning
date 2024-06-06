package recursions;

public class ReverseNum {
	static int sum = 0;
	public static void main(String[] args) {
		reverse(235);
		System.out.println(sum);
		
		System.out.println(reversNum(456));
		
		System.out.println(reversNum2(534));
		
		System.out.println(palindrome(2321));
		
	}
	static void reverse(int n) {
		if(n==0)return;
		
		int rem = n%10;
		sum = sum*10+rem;
		reverse(n/10);
	}
	
	//sometimes we might need some additional variables in the arg 
	//in that case make another func(helper fun)
	public static int reversNum(int num) {
		if(num%10 == num) return num;
		int dig = (int) Math.log10(num)+1;
		
		return (int) (((num%10)*Math.pow(10, dig-1)) + reversNum(num/10));
	}
	
	public static int reversNum2(int num) {
		
		int dig = (int) Math.log10(num)+1;
		
		return helper(num, dig);
	}
	
	public static int helper(int num,int dig) {
		if(num%10 == num) return num;
		
		int rem = num%10;
		return  rem * (int)(Math.pow(10, dig-1))+helper(num/10, dig-1);
		
		
	}
	
	//palindrome
	public static boolean palindrome(int n) {
		return n == reversNum2(n);
	}
	


}
