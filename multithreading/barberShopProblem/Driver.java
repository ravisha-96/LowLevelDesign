package multithreading.barberShopProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Driver {
    int maxCustomer = 10;
    ReentrantLock lock = new ReentrantLock();
    Condition hairCut = lock.newCondition();
    Condition customerAvailable = lock.newCondition();
    Condition barberAvailable = lock.newCondition();
    int customerCount = 0;

    private void barber() {
        while(true) {
            try {
                lock.lock();
                while(customerCount == 0) {
                    customerAvailable.await();
                }
                System.out.println("Barber starts haircut " + customerCount);
                // Thread.sleep(2000); //Cut hair for 2 sec
                System.out.println("Barber finishes haircut \n");
                customerCount--;
                barberAvailable.signal();
            } catch(Exception ex) {

            } finally {
                lock.unlock();
            }

        }
    }

    private void customer() {
        lock.lock();
        try {
            if(customerCount == maxCustomer) {
                System.out.println("customer " + Thread.currentThread().getName() + " leaves " + "shop is full");
                return;
            }
            customerCount++;
            customerAvailable.signal();
            barberAvailable.await();
            System.out.println(Thread.currentThread().getName() + " leaves the shop after haircut");
        } catch(Exception e) {

        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        Driver d = new Driver();
        
        Thread barber = new Thread(() -> {
            d.barber();
        });
        List<Thread> customerThread = new ArrayList<>();
        for(int i = 0; i < 15; i++) {
            Thread customer = new Thread(() -> {
                d.customer();
            }, "thread" + i);
            customerThread.add(customer);
        }

        barber.start();

        for(Thread c : customerThread) {
            c.start();
        }

        try {
            barber.join();
            for(Thread c : customerThread) {
                c.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
    }
}
