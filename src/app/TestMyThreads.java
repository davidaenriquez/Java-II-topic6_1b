package app;

/**
 * The TestMyThreads class demonstrates the creation and execution of threads in Java.
 * It provides examples of creating threads by extending the Thread class and implementing
 * the Runnable interface. The main method starts two threads, MyThread1 and MyThread2,
 * reflecting different approaches to thread creation and execution.
 */
public class TestMyThreads {

    /**
     * The main method serves as the entry point of the program.
     * It creates instances of MyThread1 and MyThread2, then starts
     * them to demonstrate thread execution.
     *
     * @param args Command-line arguments (not used in this program).
     */
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