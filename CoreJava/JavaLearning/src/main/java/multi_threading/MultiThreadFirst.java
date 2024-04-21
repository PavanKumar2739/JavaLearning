package multi_threading;

public class MultiThreadFirst {
	public static void main(String[] args) {
		 System.out.println(Thread.currentThread().getName());
		 System.out.println(Thread.activeCount());
		 System.out.println(Thread.currentThread().getId());
		 System.out.println(Thread.currentThread().getPriority());
		 
		 Thread t1 = new Thread();
		// created thread since we didnt given any work so it will not be in active.
		 System.out.println(Thread.activeCount());
		 
		 //now we will start 
		 t1.start();
		 
		 //now i will create multiple threads
		 Thread t2 = new Thread();
		 Thread t3 = new Thread();
		 Thread t4 = new Thread();
		 t2.start();
		 t3.start();
		 t4 .start();
		 
		 System.out.println("Other thread created "+Thread.activeCount());
		 
		 //created the thread overrided in the emp class so to use it as shown below 
		 //we need to call the start it self it will call the run method to create the thread
		 Emp emp = new Emp("Employee");
		 emp.start();
		 
		 System.out.println("now another thread created "+Thread.activeCount());
		 
		 Manager m = new Manager("Manager");
		 m.start();
		 
		 System.out.println("now another thread created manager  "+Thread.activeCount());
		 }

}
class Emp extends Thread{
	public Emp(String tName) {
		super(tName);
	}
	@Override
	public void run() {
		System.out.println("Hello..! "+ Thread.currentThread().getName()+" >> id : "+Thread.currentThread().getId());
	}
}

class Manager extends Thread{
	public Manager(String tName) {
		super(tName);
	}
	@Override
	public void run() {
		System.out.println("Hii..!"+ Thread.currentThread().getName()+" >> id : "+Thread.currentThread().getId());
	}
}
