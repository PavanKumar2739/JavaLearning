package practice;

public abstract class AbsrtactDeno {
	int a;
	int b;
	AbsrtactDeno(int a,int b){
		this.a=a;
		this.b=b;
	}
public abstract void method();
public void method1() {
	System.out.println("pavan");
	method();
	
 }
}
