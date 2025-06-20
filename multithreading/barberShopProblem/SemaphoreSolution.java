package multithreading.barberShopProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaphoreSolution {
    int customerCount = 0;
    Semaphore barberSem = new Semaphore(0);
    Semaphore customerSem = new Semaphore(0);
    
    private void barber() {
        while(true) {
            barberSem.release();
            try {
                customerSem.acquire();
                barberSem.acquire();
                Thread.sleep(2000); //Simulate haircut
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                customerCount--;
            }
        }
        //Perform haircut
    }

    private void customer() {
        if(customerCount == 10) {
            System.out.println("No chair available, will come other day");
            return;
        }
        try {
            customerCount++;
            customerSem.release();
            barberSem.acquire();
            System.out.println(Thread.currentThread().getName() + "has got the hair cut");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SemaphoreSolution d = new SemaphoreSolution();
        
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
