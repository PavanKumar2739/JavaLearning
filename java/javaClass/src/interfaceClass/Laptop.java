 package interfaceClass;

public interface Laptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void security() {
		common();
		System.out.println("Laptop Security");
	}
	static void mike() {
		common();
		System.out.println("Laptop mike");
	}
	private static void common() {
		System.out.println("private common method");
	}
}
