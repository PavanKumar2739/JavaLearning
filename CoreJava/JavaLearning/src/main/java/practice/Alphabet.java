package practice;

public enum Alphabet implements Demo {
A(50),B(10),C(30);
	int v1=10;
	
//	 static String getLetter() {
//		return A.toString();
//	}
	Alphabet(int w){
		System.out.println("s: "+w);
	}
	 public static void main(String[] args) {
		//System.out.println(Alphabet.getLetter());
		Alphabet v=Alphabet.A;
		//Alphabet v1=Alphabet.C;
		//System.out.println(v+""+v.v1);
		//float f=18.2/2
				;
		float f1=18.2F/2;
		int b=17;
		float f2=b/2;
		System.out.println(f2);
	}
}
