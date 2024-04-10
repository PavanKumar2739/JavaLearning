package puru;

public class Bank {
	
  static int currentBalace=10000;

public static void greetCustomer() { 
  System.out.println("Hello Dear Customer! Welcome to Purush Bank");
}

public static int currentBalance(int currentBalance) {
  System.out.println("Your Current Balance is: "+currentBalance);
  return currentBalance;
  
}
public void deposit(int amount) {
  currentBalace=currentBalace+amount;
  System.out.println("your Current Balance is: "+currentBalace);
  
}
public static void withdrawl(int remove) {
	currentBalace=currentBalace-remove;
  System.out.println("Your Current Balance is: "+currentBalace );
}
public int getCurrentBalance() {
  return currentBalance(currentBalace);
}


  public static void main(String[] args) {
    Bank bank=new Bank();
    greetCustomer();
    currentBalance(10000);
    bank.deposit(50000);
    withdrawl(20000);
    System.out.println("Thanks for Banking with us");
    bank.getCurrentBalance();
  }
}
