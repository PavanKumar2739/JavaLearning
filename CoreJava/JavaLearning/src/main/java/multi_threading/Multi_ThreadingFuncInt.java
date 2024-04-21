package multi_threading;

public class Multi_ThreadingFuncInt {
	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("Fun Int 1 "+ Thread.currentThread().getName()+" >> id : "+Thread.currentThread().getId());
		Runnable r2 = () -> System.out.println("Fun Int 2 "+ Thread.currentThread().getName()+" >> id : "+Thread.currentThread().getId());
		Thread t1 = new Thread(r1,"T1");
		Thread t2 = new Thread(r2,"T2");
		
		t1.start();
		t2.start();
		
		new Thread(()-> System.out.println("Anony "+ Thread.currentThread().getName()+" >> id : "+Thread.currentThread().getId())
				).start();
	}

}
