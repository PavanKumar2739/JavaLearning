package recursions;

public class CountOFNUm {
	public static void main(String[] args) {
		System.out.println(countNum(103040,0));
		
	}
	public static int countNum(int n, int c) {
		if( n == 0) return c;
		
		if(n%10 == 0) return countNum(n/10, ++c);
		
		return countNum(n/10, c);
	}

}
