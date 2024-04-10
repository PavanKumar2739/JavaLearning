package overRidding;

abstract class AbstractClass {
public abstract void on();
public abstract void off();
}

class fan extends AbstractClass {
	@Override
	public  void on()
	{
	 System.out.println("fan starts");	
	}
	
	@Override
	public  void off()
	{
	 System.out.println("fan stops");	
	}
	
}

class tester()
{
	fan f =new fan();
	f.on();
	f.off();
}