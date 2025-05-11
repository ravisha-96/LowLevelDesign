package multithreading.basics.future;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableExample implements Callable<Integer>{
    //Callable is similar to Runnable except the run method here
    //return value
    @Override
    public Integer call(){
        // TODO Auto-generated method stub
        try {
            Thread.sleep(3000);
            return new Random().nextInt(500);
        } catch(InterruptedException e) {
            System.out.println("task got interrupted while sleeping" + Thread.currentThread().getName());
        }
        return -1;
    }

    public static void main(String[] args) {
        
        ExecutorService fixedPool = Executors.newFixedThreadPool(5);
        List<Future<Integer>> returnedValuesFromThread = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Future<Integer> futureObj = fixedPool.submit(new CallableExample());
            returnedValuesFromThread.add(futureObj);
        }

        //It will throw interupted exception, as all the tasks executed
        //as well as waiting in the queue will be interrupted
        for(Future<Integer> futureObj: returnedValuesFromThread) {
                try {
                    System.out.println(futureObj.get(2, TimeUnit.SECONDS)); //Blocking call
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
