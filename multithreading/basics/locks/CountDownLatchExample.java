package multithreading.basics.locks;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        //CountDownlatch Allows one or more threads to wait until a set of operations 
        //being performed in other threads completes.
        CountDownLatch latch = new CountDownLatch(3);

        Runnable worker = () -> {
            System.out.println(Thread.currentThread().getName() + " done");
            latch.countDown(); // Decrement latch
        };

        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();

        try {
            latch.await(); // Wait here until countDown is called 3 times
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        System.out.println("All workers finished");

    }
}
