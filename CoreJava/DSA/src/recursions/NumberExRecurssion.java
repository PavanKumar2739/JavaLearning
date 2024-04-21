package recursions;

public class NumberExRecurssion {
	public static void main(String[] args) {
		print(1);
	}
	//now it will call it self by incrementing here the catch it will be time out since there is no break
	static void print(int i) {
		if(i==5) {
			System.out.println(5);
			return;// return to whrere its called
			} //this will break the recurssion
		System.out.println(i);
		//recursive call
		//if you are calling a function again and again, you can treat it as a separate call in the stack
		
		//this is known as tail recursion
		//this is the last function call
		print(i+1);
	}

}
