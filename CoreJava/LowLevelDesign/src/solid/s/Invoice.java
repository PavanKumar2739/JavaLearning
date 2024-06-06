package solid.s;

/**
 * a class should have only one reason to change
 * @author pavan
 *
 */
public class Invoice {
	
	private Marker marker;
	private int quantity;
	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	
	public int calculateTotal() {
		int price = marker.price*this.quantity;
		return price;
		// there might be calculation logic changes
	}
	public void printInvoice() {
		// print the invoice
		// insted of printing i want to do some other func
	}
	public void saveToDB() {
		// save data to DB
		///there maybe chace db creds changes or db changes
	}
	//above case we can clarly see that there is multiple ways we might need to modify the class functions
	// so this is not following the rules.

}
