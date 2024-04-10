package practice;

public class subDeno implements Demo {

	
	public void method1() {
		System.out.println("pavan1");
		
	}
	
	public static void main(String[] args) {
		Demo demo=new subDeno();
		//demo.method();
		LazyInitialization obj=LazyInitialization.getObj();
		LazyInitialization obj1=LazyInitialization.getObj();
		ImmutableClass iM=ImmutableClass.createInstance(10);
		
	}
	public void method() {
		System.out.println("pavan10");
	}

}
