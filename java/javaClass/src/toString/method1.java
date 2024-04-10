package toString;

public class method1 {
	String name;
	String color;
	
	int price;
public String toString()
{
	return this.name+" "+this.color+" "+this.price;
}
public static void main(String[] args) {
	method1 m1=new method1();
	m1.name="pavan";
	m1.color="white";
	m1.price=20;
	System.out.println(m1);
}
}
