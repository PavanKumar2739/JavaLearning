package strings.hyr;

public class StringsFirst {
	/**
	 * Strings are always immutable its saving in string constant pool so it will give address
	 * StringBuffer and builder
	 * string buffer is for multi-thread env due to performance issue in synchronized case string builder was introduced
	 * both are exactly same like a twins methods and variables all are rxactly same
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "Pavan";
		String s2 = "Pavan";
		//some operations
		System.out.println(s1 == s2); 
		
		 s1 = s1+"Kumar";//PavanKumar
		 
		 System.out.println(s1 == s2); 
		 
		 String s3 = "PavanKumar";
		 //if we can able to change means the variables should not be equals
		 System.out.println(s1 == s3); 
		 
		 System.out.println(">>>>>>>>>>>>>>>>>>>>Mutabl<<<<<<<<<<<<<<<<<<<,");
		 
		//lets see the strng buffer
		StringBuffer sb1 = new StringBuffer("Pavan");//address ex 24
		StringBuffer sb2 = new StringBuffer("Pavan");//address ex 26
		System.out.println(sb1 == sb2); // only checks the address 
		sb1 = sb1.append("Kumar");
		
		System.out.println(sb1 == sb2); 
				
		StringBuffer sb3 = new StringBuffer("PavanKumar");//same for string builder as well all methods are same soo
	    
	    System.out.println(sb1 == sb3); 
		
		
		 
	}

}
