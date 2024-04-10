

class tester2 {
	
	public void m1()
	{
		System.out.println("hiding...first method 1");
		
	}
	public  void m2()
	{
		System.out.println("over...2ed method 1");
	}
}
class  stat1 extends tester2
{
	public void m1()
	{
		System.out.println("hiding ...first method");
		
	}
	public void m2()
	{
		System.out.println("over ...2ed method");
	}	

}

public class tester
{
public static void main(String[] args) {
tester2 m=null;
 m=new stat1();
 m.m1();
 m.m2();
 
		 
}
	}