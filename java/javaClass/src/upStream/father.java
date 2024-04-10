package upStream;

class father {
	int m=60000;
	String c="Audi";
	
//	void drink()
//	{
//		System.out.println("boom boom");
//	}
//	
	public static void main(String[] args) {
		father f=new son();
		f.drink();
	}
}
class son extends father{
	String b="R15";
	
	void drink()
	{
		System.out.println("boost");
	}
	void exercise()
	{
		System.out.println("every day");
	}
}