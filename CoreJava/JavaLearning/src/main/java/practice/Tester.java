package practice;

public class Tester {
	public static int reduce(int x) {
		
		class comp{
			int y=4;
			int reduce(int x)
			{
				return x-y--;
			}
			
	}
		comp c=new comp();
		return c.reduce(x);
	
	}
	public static void main(String[] args) {
		System.out.println(reduce(1));
		System.out.println(Num.ONE.ordinal());
		int b=0;
		for(b=0;b<10;b++) {
			continue;
		}
		System.out.println(b);
//		Book1 b1=new Book1("s");
//		System.out.println();

	}

}
