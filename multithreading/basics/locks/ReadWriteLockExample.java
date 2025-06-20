package multithreading.basics.locks;

import java.sql.Time;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    private ReadWriteLock rwLock;
    private String isAvailable;

    ReadWriteLockExample() {
        rwLock  = new ReentrantReadWriteLock();
        isAvailable = "StartingValue";
    }

    public String readResource(String thread) {
        try{
            rwLock.readLock().lock();
            return isAvailable;
        }catch(Exception ex){

        }finally {
            rwLock.readLock().unlock();
        }
        return thread;
    }

    public String writeResource(String thread) {
        try {
            rwLock.writeLock().lock();
            isAvailable = "newValue" + Math.random();
            return isAvailable;
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            rwLock.writeLock().unlock();
        }
        return isAvailable;
    }

    public static void main(String[] args) {
        ReadWriteLockExample rwExample = new ReadWriteLockExample();

        Thread readThread = new Thread(() -> {
            System.out.println("Reading the value " +rwExample.readResource("readThread"));
        });

        Thread readThread2 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Reading the value " +rwExample.readResource("readThread"));
        });

        Thread writeThread = new Thread(() -> {
            System.out.println("writing new value" + rwExample.writeResource("writeThread"));
        });

        Thread writeThread2 = new Thread(() -> {
            System.out.println("writing new value" + rwExample.writeResource("writeThread"));
        });


        readThread.start();
        readThread2.start();
        writeThread.start();
        writeThread2.start();

    }
}
