package toString;

public class pen {
	String name;
	String color;
	int price;
	pen(String name,String color,int price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		
	}
	public String toString()
	{
		return name+" "+color+" "+price;
	}
	public static void main(String[] args) {
		pen p1=new pen("cello","black",10);
		pen p2=new pen("cammil","red",15);
		pen p3=new pen("cello","blue",10);
		pen p4=new pen("Bitco","blue",5);
		pen p[]= {p1,p2,p3,p4};
		for(int i=0;i<p.length;)
		{
			System.out.println(p[i]);
			i=i+2;
		}
	}

}
