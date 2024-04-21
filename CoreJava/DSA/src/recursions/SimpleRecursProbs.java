package recursions;

public class SimpleRecursProbs {
	public static void main(String[] args) {
		System.out.println(fac(5));;
		System.out.println(pow(2,3));
		
	}
	public static int fac(int n) {
		if(n<=2) return n;
		return fac(n-1)*fac(n-1);
	}
	public static int pow(int x,int y) {
		if(y==0) {
			return 1;
		}
		if(y == 1) {
			return x;
		}
		return x*pow(x,y-1);
	}

}
