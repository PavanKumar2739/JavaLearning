package practice;

import java.util.List;

abstract class book {
	static String s=".";
book(){
	//System.out.println("base");
	s+="V";
}
book(String s){
	//System.out.println("s");
	
}
public  void p(List l) {
	l.add(007);
}

protected void m() {
	System.out.println("fsd");
}

}
