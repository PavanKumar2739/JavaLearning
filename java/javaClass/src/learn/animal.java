package learn;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

 class vehicle extends Object {
	 private int price;
     String color;
	public vehicle(int price,String color) {
        
		this.price = price;
     	this.color=color;
		System.out.println(color);
	}
  public int engine(int i)
	{
		System.out.println("StartEngine");
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(++price);
		return price;
	}
   public static void Stopengine(int i)
	{
		System.out.println("StopEngine");
	
	}
	private void TopSpeed()
	{
		System.out.println("TopSpeedwqw");
	}
	public static void main(String[] args) {
		String s1="in";
		String s2="in";
		if(s1==s2)
			System.out.println("equal");
		if(s1.equals(s2))
			System.out.println("equals");
		
		System.out.println("*****************");
		vehicle B =new test(10,"green");
		vehicle B1 =new test(10,"green");
		String s=new String("pavan");
		String s3=new String("pavan");
		Set <vehicle> v=new HashSet<>();
		v.add(B);
		v.add(B1);
		System.out.println(v);
		System.out.println(B==B1);
		System.out.println(B.equals(B1));
		String s4="pav";
		String S2="pav";
		System.out.println(B==B1);
		System.out.println(B.equals(B1));
		System.out.println(s.equals(s1));
		//B.Stopengine();
		System.out.println(s2==S2);
		vehicle vehicle=new test(10,"green");
		vehicle.TopSpeed();
		
		System.out.println("*****************");
	new vehicle(1,"pav");
//		B1.engine();
//		B1.engine();
//		
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(color, price);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		vehicle other = (vehicle) obj;
//		return Objects.equals(color, other.color) && price == other.price;
//	}

}
class bike_1 extends vehicle{
	
	public bike_1() {
		super(5, "green");
		// TODO Auto-generated constructor stub
		System.out.println(color);
	}
	
	protected void engine()
	{
	
		System.out.println("StartEngine started");
	}
	public static void Stopengine(int i)
	{
		System.out.println("StopEngine stopped122");
	
	}
	private void TopSpeed()
	{
		System.out.println("TopSpeed 100");
	}
}
class test extends bike_1
{
	public vehicle vc;
	public test(int price, String c) {
		super();
		this.color=c;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		vehicle B1 =new bike_1();
		test c=new test(10,"pac");
		c.engine(7);
		//B1.Stopengine(20);
		c.vc.engine(0);
	}
}