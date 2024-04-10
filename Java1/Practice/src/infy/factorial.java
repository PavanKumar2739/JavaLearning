package infy;

public class factorial {
   int a='k';
   int b=20;
   
   public int fac(int num) {
	   int f=1;
	   for(int i=1;i<=num;i++) {
		   f=f*i;
	   }
	   return f;
	 
   }
   
   public void addition(int b,int a) {
	   System.out.println(this.a+b);
   }
   public void addition(String b,int a) {
	 
   }
  public int addition() {
	return a+b;
   }

	public static void main(String[] args) {
		int num=6;
		factorial fac = new factorial();
		int d=fac.addition()+10;
		System.out.println(d);
		fac.addition(10, 20);
		System.out.println("factorial of "+num+" is : "+fac.fac(num));
		
	}
}
