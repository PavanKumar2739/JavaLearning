package poly;



class Customer
{
    public String customerId;
    public String customerName;
    public long contactNumber;
    
    Customer(String customerId,String customerName,long contactNumber){
        this.customerId=customerId;
        this.customerName=customerName;
        this.contactNumber=contactNumber;
        
    }
    public double payBill(double totalPrice) {
        System.out.println("Final Bill amount for Customer is being calculated here");
    return totalPrice;
    }
}
    class RegularCustomer extends Customer{
        float discountPercentage;
        RegularCustomer(String custId,String custName,long mobileNo,float dis){    
        super(custId,custName,mobileNo);
            this.discountPercentage=dis;
            
            System.out.println("****"+custId);
            super.payBill();
        
        }
        @Override
        public double payBill(double totalPrice) {
        System.out.println("Final Bill amount for Customer is being calculated here");
        double priceAfterDiscount=totalPrice-(totalPrice*discountPercentage)/100;
        return priceAfterDiscount;
        
        }
        
        
    }
    
public class Test1 {
    
    public static void main(String[] args) {
//        Customer customer=new Customer("C101","Aman Pande",984532167L);
//        double amount= customer.payBill(40.0);
//        System.out.println("Final amount of bill is:"+(int)(amount*100)/100.0);
//        
        
        RegularCustomer regularCustomer=new RegularCustomer("C102","Sushobhit",9876543210L,5.0f);
        double amount1=regularCustomer.payBill(41.0);
        System.out.println("Final bill amount will be :"+(int)(amount1*100)/100.0);
        
        Customer regularCustomer1=new RegularCustomer("C103","Ajin",783277484L,5.0f); //Dynamic binding
        double amount2=regularCustomer1.payBill(60);
        System.out.println("Final amount of bill is now:"+(int)(amount2*100)/100.0);
    }
}





