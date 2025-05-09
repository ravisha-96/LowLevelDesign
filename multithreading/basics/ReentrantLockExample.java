package multithreading.basics;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private static ReentrantLock reLock;

    ReentrantLockExample() {
        reLock = new ReentrantLock();
    }

    public void sharedMethod(String thread) {
        
        try {
            reLock.lock();
            System.out.println(thread + " executing");
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            reLock.unlock();
        }
        
    }

    public static void main(String[] args) {
        ReentrantLockExample reLockEx = new ReentrantLockExample();
        ReentrantLockExample reLockEx2 = new ReentrantLockExample();
        //If we use different objects in thread and lock is not static
        //locking on each object will happen independently
        //If we declare the lock as static, then the both thread will use the same lock
        Thread t1 = new Thread(() -> {
            reLockEx.sharedMethod("thread1");
        });

        Thread t2 = new Thread(() -> {
            reLockEx2.sharedMethod("thread2");
        });
        t1.start();
        t2.start();
    }

}
