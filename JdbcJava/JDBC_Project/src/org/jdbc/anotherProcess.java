package org.jdbc;

public class anotherProcess {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");//fully qualified value of the sql driver
		System.out.println("loaded");
	}
	catch (ClassNotFoundException e) {
		System.out.println(e);
	}
}
}
