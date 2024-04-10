package strings;

public class Comparisions {
	public static void main(String[] args) {
		String a= "Pavan";
		String b = "Pavan ";
		String c = b;
		// ==
		System.out.println(a == b);
		
		//equals
		
		String a1 = new String("pavan");
		String b1 = new String("pavan");
		System.out.println(a1 == b1);//false
		System.out.println(a1.equals(b1));//true
		//so mostly we dont use the above way we use mostly string pool
		
		System.out.println(a.charAt(0));
		
	}

}
