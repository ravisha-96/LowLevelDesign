package multithreading.basics;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    //Create a semaphore lock
    //Without private static, we each object will have its own semaphore lock
    private static Semaphore sLock = new Semaphore(2);

    private void printSomething(String thread) {
        try {
            sLock.acquire(); //Important
            for(int i = 0; i < 3; i++)
                System.out.println(thread);
                Thread.sleep(3000);
        } catch(Exception e) {

        } finally {

            sLock.release(); //Important
        }
        
    }


    public static void main(String[] args) {
        SemaphoreExample se1 = new SemaphoreExample();
        SemaphoreExample se2 = new SemaphoreExample();
        
        Thread t11 = new Thread(() -> {
            se1.printSomething("thread11");
            
        });

        Thread t21 = new Thread(() -> {
            se2.printSomething("thread21");
            
        });

        // Thread t12 = new Thread(() -> {
        //     se1.printSomething("thread12");
        // });

        // Thread t22 = new Thread(() -> {
        //     se2.printSomething("thread22");
        // });

        // Thread t13 = new Thread(() -> {
        //     se1.printSomething("thread13");
        // });

        // Thread t23 = new Thread(() -> {
        //     se2.printSomething("thread23");
        // });

        //If semaphore permit is 1 only 1 thread will be executing at a time
        t11.start();
        // t12.start();
        // t13.start();
        t21.start();
        // t22.start();
        // t23.start();
    }
}
