package multithreading.basics.locks;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CycleBarrierExample {
    public static void main(String[] args) {
        //Allows a set of threads to wait for each other to reach a common barrier point.
        //Unlike CountDownLatch, it can be reused (hence “cyclic”).
        //Pause until all N threads arrive, then continue together

        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            //What you want to do once the barrier is reached
            System.out.println("All threads reached the barrier!");
        });

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " waiting");
            try {
                barrier.await(); // Wait here
            } catch (InterruptedException | BrokenBarrierException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
            System.out.println(Thread.currentThread().getName() + " passed barrier");
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();


        //Reusability example

        int numWorkers = 3;

        // Barrier with action: called after each barrier is passed by all threads
        CyclicBarrier barrier2 = new CyclicBarrier(numWorkers, () -> {
            System.out.println(">>> All threads completed a phase. Moving to next...\n");
        });

        Runnable worker = () -> {
            try {
                for (int phase = 1; phase <= 2; phase++) {
                    System.out.println(Thread.currentThread().getName() + " - Phase " + phase + " started");
                    Thread.sleep((long) (Math.random() * 1000)); // simulate work

                    System.out.println(Thread.currentThread().getName() + " - waiting at barrier for Phase " + phase);
                    barrier2.await(); // wait for others to finish phase
                }

                System.out.println(Thread.currentThread().getName() + " - All phases complete.");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };

        // Start threads
        for (int i = 0; i < numWorkers; i++) {
            new Thread(worker, "Worker-" + i).start();
        }
    }
}
