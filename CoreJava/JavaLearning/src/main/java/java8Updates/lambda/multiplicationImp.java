package java8Updates.lambda;

import java.util.function.Predicate;

public class multiplicationImp {
public static void main(String[] args) {
	MultiplicationInt m=(a,b)->(a*b);
	System.out.println(m.multiplication(10, 5));
	
	Predicate<String> lenCheck=i->(
		i.length()>10
		
	);
	System.out.println(lenCheck.test("vsafsadvsd"));
}
}
