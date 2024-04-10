package AbstractClass;

public interface Laptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
		
}
abstract class vendor implements Laptop{
	public void copy() {
		System.out.println(" Copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("paste code"); 
		
	}
	
public abstract void cut();
	
	
}

class Lenovo extends vendor{

	public void cut() {
		System.out.println("Lemovo cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Lemovo keyboard code");
}
}

class Hp extends vendor{

	public void cut() {
		System.out.println("Hp cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Hp keyboard code");
}
	public void sound() {
		System.out.println("Hp sound code");
	}
}