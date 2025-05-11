package multithreading.basics.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RunnableExample implements Runnable{
    //Callable is similar to Runnable except the run method here
    //return value
    @Override
    public void run(){
        // TODO Auto-generated method stub
        try {
            Thread.sleep(3000);
            System.out.println("thread completed");
        } catch(InterruptedException e) {
            System.out.println("task got interrupted while sleeping" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        
        ExecutorService fixedPool = Executors.newFixedThreadPool(5);
        List<Future<?>> threadStatus = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Future<?> futureObj = fixedPool.submit(new RunnableExample());
            threadStatus.add(futureObj);
        }

        //It will throw interupted exception, as all the tasks executed
        //as well as waiting in the queue will be interrupted
        for(Future<?> future : threadStatus) {
            try {
                Thread.sleep(1000);
                System.out.println("Is Done " + future.isDone());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        for(Future<?> futureObj: threadStatus) {
                try {
                    System.out.println(futureObj.get(2, TimeUnit.SECONDS)); //Blocking call
                    //Returns null in case of runnable
                    //So no point in printing it
                    //but the timeout can be used to detect if the task was completed.
                } catch (TimeoutException e) {
                    System.out.println("time out while waiting for the task, is it cancelled" + futureObj.isCancelled());
                    e.printStackTrace();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
           
        }
        fixedPool.shutdown(); 
    }

}
