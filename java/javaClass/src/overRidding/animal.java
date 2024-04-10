package overRidding;

class vehicle {
	int price;
	String color;
	public vehicle(int price,String color) {

		this.price = price;
		this.color=color;
	}
	void engine()
	{
		System.out.println("StartEngine");
	}
	void Stopengine()
	{
		System.out.println("StopEngine");
	}
	void TopSpeed()
	{
		System.out.println("TopSpeed");
	}
	public static void main(String[] args) {
		bike_1 B =new bike_1(10,"green");
		B.Stopengine();
	}

}
class bike_1 extends vehicle{
	public bike_1(int price, String color) {
		super(price, color);
		// TODO Auto-generated constructor stub
	}
	int price;
	void engine()
	{
		System.out.println("StartEngine started");
	}
	void Stopengine()
	{
		System.out.println("StopEngine stopped");
	}
	void TopSpeed()
	{
		System.out.println("TopSpeed 100");
	}

}