package strings;

public class First {
	public static void main(String[] args) {
		String a= "pavan";
		String b = "pavan";
		//in above case the string creates an object and that is pavan
		//each time the variable creates with same it will be point out to the same variable obj which is there in heep(string pool)
		//we cant directly change the object once its crated since strings are immutable, due to some security resons
		//but we can override with other object;
		System.out.println(b);
		b = "kumar";
		System.out.println(b);
		///
	}

}
