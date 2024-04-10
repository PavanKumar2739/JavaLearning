package AbstractClass;

abstract class PBat {

	String name;
	int price;
	
	abstract void Brand();
	abstract void weight();
	
}

class sports extends PBat
{
	@Override
	void Brand()
	{
		System.out.println("MRF");
	}
	@Override
	void weight()
	{
		System.out.println("10");
	}
}

