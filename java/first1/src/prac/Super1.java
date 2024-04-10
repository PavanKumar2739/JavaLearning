package prac;

public class Super1 {
	
	private String a;
	 String b="Good Player";
//public Super1(String a2) {
		// TODO Auto-generated constructor stub
	
	
Super1()
{
	this.a=a;
System.out.print("Pavan ");

}
public String tv()
{
	return a;
}
void Super()
{
	System.out.print(" is a good boy,");
	
}

}
class Super2 extends Super1
{
String b=" also Good Developer";
	Super2()
	{
		//super(c);
		//this.a=a;
		System.out.println(" ");
	}
		// TODO Auto-generated constructor stub
		void Super()
		{
			System.out.print( tv());
			super.Super();
			System.out.println(b+" and "+ super.b);
		}
		
	public static void main(String[] args) {
		Super2 s=new Super2();
		s.Super();
	}
	
}
