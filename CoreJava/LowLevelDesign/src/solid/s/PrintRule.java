package solid.s;

public class PrintRule {
	private InvoiceRule invoice;

	public PrintRule(InvoiceRule invoice) {
		this.invoice = invoice;
	}
	
	public void printInvoice() {
		// print the invoice
		// insted of printing i want to do some other func
		//so this also satisfying the rules
	}
	
	
}
