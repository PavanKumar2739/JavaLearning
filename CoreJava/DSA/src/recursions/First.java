package recursions;

public class First {
	public static void main(String[] args) {
		//write a function that prints hello world
		//if i want to call five times only calling at once how i can do
		message();
		
		//whats happening the fuc calling another function
	}
	static void message() {
		System.out.println("Hello world..!");
		message1();//calls and go inside
	}

	static void message1() {
		System.out.println("Hello world..!");
		message2();
	}

	static void message2() {
		System.out.println("Hello world..!");
		message3();
	}

	static void message3() {
		System.out.println("Hello world..!");
		message4();
	}

	static void message4() {
		System.out.println("Hello world..!");
	}

}
