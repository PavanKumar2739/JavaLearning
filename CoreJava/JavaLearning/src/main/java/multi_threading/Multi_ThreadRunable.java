package multi_threading;

public class Multi_ThreadRunable {
	public static void main(String[] args) {
		Student s = new Student();
		//since we  cant call the method directly we create obj of theread and use it
		Thread t1 = new Thread(s,"Student");
		t1.start();
				 
		 System.out.println("now another thread created stu "+Thread.activeCount());
		 
		 Teacher m = new Teacher();
		 Thread t2 = new Thread(m,"Teacher ");
			t2.start();
		 //m.start();
		 
		 System.out.println("now another thread created teacher  "+Thread.activeCount());
	}

}

//in this case if we create an obj of the class if we try to call the start thered will not going to work since there is no method for creating theread
class Student implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello..! "+ Thread.currentThread().getName()+" >> id : "+Thread.currentThread().getId());
	}
}

class Teacher implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello..! "+ Thread.currentThread().getName()+" >> id : "+Thread.currentThread().getId());
	}
}
