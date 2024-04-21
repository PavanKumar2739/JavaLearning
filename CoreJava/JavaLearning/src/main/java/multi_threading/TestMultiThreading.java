package multi_threading;

public class TestMultiThreading {
	public static void main(String[] args) throws Exception {
		BrickDairy bd = new BrickDairy();
		Runnable r1 = () ->{
			for (int i = 0; i < 10000; i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
			}
			
		};
		Runnable r2 = () ->{
			for (int i = 0; i < 10000; i+=50) {
				bd.incrementBrickCount();
			}
			
		};

		Runnable r3 = () ->{
			for (int i = 0; i < 10000; i+=50) {
				bd.incrementBrickCount();
			}
			
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();//still we get different values because of the jvm getting confused which one is updated 
		System.out.println(bd.brickCount);//we will get zero
		System.out.println(bd.brickCount2);

	}

}
class BrickDairy{
	 int brickCount = 0;
	 volatile int brickCount2 = 0;
	
//	public synchronized void incrementBrickCount() {
//		brickCount += 50;
//	}
	//above is one way we will apply syc for the perticular variable so we can use block
	public  void incrementBrickCount() {
		synchronized(this) {
			brickCount += 50;
			
		}
		brickCount2 += 50;
	}
}
