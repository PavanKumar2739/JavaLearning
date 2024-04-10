package Functions_Methods;

public class Shadowing {
	static int x=10;//this will be shodowed
	public static void main(String[] args) {
		System.out.println(x);//take global
		int x=20;
		System.out.println(x);//take local because it will consider first in local if not means check in global
		 
	}
	void Method() {
		System.out.println(x);
	}

}
