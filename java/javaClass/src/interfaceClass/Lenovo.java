package interfaceClass;

public class Lenovo implements Laptop {

	@Override
	public void copy() {
		System.out.println("Lemovo Copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("Lemovo paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("Lemovo cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Lemovo keyboard code");
		
	}
	public void capture() {
		System.out.println("Lenovo capture code");
	}
	public void security() {
		System.out.println("Lenovo security ");
	}
	

}
