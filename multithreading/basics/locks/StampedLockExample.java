package multithreading.basics.locks;

import java.util.concurrent.locks.StampedLock;

public class StampedLockExample {
    StampedLock sLock = new StampedLock();

    public String readResource(String thread) {
        try{
            sLock.readLock();
            return isAvailable;
        }catch(Exception ex){

        }finally {
            sLock.unlockRead(0);;
        }
        return thread;
    }
    public static void main(String[] args) {
        
    }
}
