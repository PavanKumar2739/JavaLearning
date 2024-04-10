package poly;

class Person {
	String name;

	Person() {
		System.out.println("In Person class");
	}

	void print() {
		System.out.println("Person name " + name);
	}
}

public class Student extends Person {
	int id;

	Student() {
		System.out.println("In Student class");
	}
@Override
	void print() {
		System.out.println("Student name " + name);
	}

	public static void main(String args[]) {
		//Person person = null;
		Person person = new Student();
		person.name = "John";
		person.print();
	}
}
