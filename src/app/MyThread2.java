package app;

/**
 * Create a thread that implements the Runnable interface
 */
public class MyThread2 implements Runnable{
	// You will be forced to implement the run() (from the Runnable interface)
	public void run() {
		for (int x=0; x<100; ++x) {
			System.out.println("MyThread2 is running iteration " + x);
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
