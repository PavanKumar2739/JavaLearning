package practice;

public class LazyInitialization {
private static LazyInitialization obj;
LazyInitialization(){
	System.out.println("constructor called");
}
public static LazyInitialization getObj() {
	//for multi threading we have to use synchronization(this) and use again use null condition for obj
	if(obj==null) {
		obj=new LazyInitialization();
	}
	return obj;
}

}
