package InterviewQuestions;

 class Child extends Parent {
	 public void print() {
		 System.out.println("Child");
	 }
	//public 
}

public class Tester{
	public static void callMethod(Parent c) {
		c.print();
	}
	public static void main(String[] args) {
//		Integer num1= 500;
//		Integer num2 =500;
//		
//		System.out.println(num1==num2);
		Child a = new Child();
		Parent b = new Child();
		Parent c= new Parent();
		callMethod(c);
		callMethod(a);
		callMethod(b);
	}
}
