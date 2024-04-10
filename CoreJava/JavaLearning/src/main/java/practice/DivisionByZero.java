package practice;

public class DivisionByZero extends Exception{
public static final long serialVer=1L;
public DivisionByZero(String message) {
	super(message);
}
class Cal{
	public static int div(int n1,int n2) throws DivisionByZero{
		if(n2==0) {
			throw new DivisionByZero("cannot divide ");}
			return n1/n2;
		}
		
	}

}
