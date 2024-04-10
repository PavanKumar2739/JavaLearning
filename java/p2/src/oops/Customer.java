package oops;

 class customer {
		private String customerId;
		private String customerName;
		private long contactNumber;
		private  String address;
		private String addres="a";
		public customer(String customerId, String customerName, long contactNumber,
				String address) {
			this.customerId = customerId;
			this.customerName = customerName;
			this.contactNumber = contactNumber;
			this.address = address;
			
			
			
		}
		
		
		public void setAddress(String addres) {
			this.address= addres;
		}
		public String getCustomerId() {
			return address;
		}
		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
	public String Address() {
			return addres;
		}
	
		public void displayCustomerDetails() {
			System.out.println("Displaying customer details \n***********");
			System.out.println("Customer Id : " + customerId);
			System.out.println("Customer Name : " + customerName);
			System.out.println("Contact Number : " + contactNumber);
			System.out.println("Address : " + address);
			System.out.println();
			System.out.println(getContactNumber());
		}
		public double payBill(double totalPrice) {
			double discountPercentage = 5;
			System.out.println("Calculating final amount to be paid.....");
			double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
			return priceAfterDiscount;
		}
}   
 class Tester {
		public static void main(String[] args) {
			customer customer1 = new customer("C1001", "Sam", 9945000009L,
					"Carolina Street, Springfield, 62702");
			System.out.println("Final amount to be paid: $" +customer1.payBill(20));
			customer1.displayCustomerDetails();
			customer1. setAddress("a");
		System.out.println("Address : " + customer1.Address());
		System.out.println("Address : " + customer1.getCustomerId());
		}

 }

