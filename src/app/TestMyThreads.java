package app;

public class TestMyThreads {

	public static void main(String[] args) {
		// Example of how to create and start a thread that extends the Thread class
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		// Example of how to create and start a thread that implements the Runnable interface
		Runnable runnable = new MyThread2();
		Thread thread2 = new Thread(runnable);
		thread2.start();
	}

}
