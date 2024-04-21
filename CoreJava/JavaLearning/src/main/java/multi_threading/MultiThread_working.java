package multi_threading;

import java.util.Iterator;

public class MultiThread_working {
	public static void main(String[] args) throws Exception {
		Runnable r1 = () ->{ 
			for (int i = 0; i < 10; i++) {
				System.out.printf("%nStudent %d "+ Thread.currentThread().getName()+" >> id : "+Thread.currentThread().getId(),i);
			}
			
			};
		Runnable r2 = () -> {
		for (int i = 0; i < 20; i++) {
			System.out.printf("%nTeacher %d "+ Thread.currentThread().getName()+" >> id : "+Thread.currentThread().getId(),i);
		}
		};
		Thread t1 = new Thread(r1,"S1");
		Thread t2 = new Thread(r2,"T1");
		
		t1.start();
		//t1.join(); next threads will start until this t1 complete 
		t2.sleep(10000);
		t2.start();
		
		
		
	}

}
