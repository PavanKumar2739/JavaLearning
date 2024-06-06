package recursions;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sumOfDig(1234));
		
		System.out.println(prodOfDig(29));
		
		System.out.println(reversNum(345));
	}
	
	public static int sumOfDig(int num) {
		if(num==0) return 0;
		
		return num%10 + sumOfDig(num/10);
		
	}
	public static int prodOfDig(int num) {
		if(num%10==num) return num;
		
		return num%10 * prodOfDig(num/10);
		
	}
	
	public static void fun(int n) {
		if(n == 0 ) return;
		
		System.out.println(n);
		fun(n--);// we will get the stack overflow because of the it will pass n and sup so n will not reduce it will remain same
	}
	
	public static int reversNum(int num) {
		if(num%10 == num) return num;
		return ((num%10)*10) + reversNum(num/10);
	}

}
