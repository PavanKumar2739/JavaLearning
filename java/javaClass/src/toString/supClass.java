package toString;

class supClass {
	public int a;
	public int b;
	public String c;
	public double d;
	
	
//	supClass()
//	{
//		System.out.println("super 1 class called");
//	}
	supClass(int a)
	{
		this.a=a;
		System.out.println("super 2 class called");
	}
	supClass(int a,int b,String c,double d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		System.out.println("super 3 class called");
	}
	public static void main(String[] args) {
		newClass n=new newClass(10, 20, 3, "pavan", 5);
		newC n1=new newC(10, 20, 3, "pavan", 4);
	}
	
}
class newClass extends supClass
{
     int f;
	newClass( int e,int a,  double m, String d,int f) {
		super(a, e, d, m);
		// TODO Auto-generated constructor stub
		this.f=f;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+m);
		
	}
	
}
class newC extends newClass
{
     int g;
	newC( int e,int a,  double m, String d,int f) {
		super(a, e, m, d,f);
		// TODO Auto-generated constructor stub
		this.g=f;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+m+" "+g);
		
	}
}
class newCla extends supClass
{
     int f;
	newCla(int f) {
		super(10, 20, "pavan", 30);
		// TODO Auto-generated constructor stub
		this.f=f;
		System.out.println(a+" "+b+" "+c+" "+d+" "+f);
		
	}
	
}
