package practice;

public class NotANumber {

	static float name1(String s,float min,float max) {
	    float f=Float.parseFloat(s);
	    if(!Float.isFinite(f)||f<min||f>max) {
	    	throw new IllegalArgumentException();
	    }
	    return f;
	}
	   static float name3(String s,float min,float max) {
	    	 float f=Float.parseFloat(s);
 if(Float.isFinite(f)&&f<min&&f>max) {
	throw new IllegalArgumentException();
 }
	return f;
	    }
 static float name4(String s,float min,float max) {
	 float f=Float.parseFloat(s);
 if(f<min||f>max) {
	 throw new IllegalArgumentException();
	    }
 return f;
 }
		
	
	static float name2(String s,float min,float max) {
		
		return Float.parseFloat(s);
	}
	public static void main(String[] args) {
	//System.out.println(NotANumber.name1("e", 0, 2));
//	System.out.println(NotANumber.name3("e", 0, 2));
	//System.out.println(NotANumber.name4("e", 0, 2));
	
	System.out.println(NotANumber.name2("e", 0, 2));
	}
}
