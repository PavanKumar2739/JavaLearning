
public class Catching {
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    // Write your code here
		if(x1>x2){
	        while(x1>x2){
	           x1+=v1;
	           x2+=v2;
	        }
	    }
	    else if(x1<x2){
	        while(x1<x2){
	           x1+=v1;
	           x2+=v2;
	        }
	        }
	        if(x1==x2){
	            return "YES";
	        }
	        return "NO";
	    

	    }

	public static void main(String[] args) {
		System.out.println(kangaroo(21, 6, 47, 3));
		
	}

}
