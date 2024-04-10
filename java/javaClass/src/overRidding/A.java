package overRidding;

 public class A {
	void dis()
	{
		System.out.println("parent");
	}
	public static void main(String[] args) {
		B c=new B();
		c.dis();
	}

}
 class B extends A{
	void dis()
	{
		System.out.println("child");
	}

}
 