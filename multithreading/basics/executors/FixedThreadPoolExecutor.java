package multithreading.basics.executors;

import java.sql.Time;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecutor {
    private static Time startTime = Time.valueOf(LocalTime.now());
    public static void main(String[] args) {
        ExecutorService fixedThreadPoolExecutor = Executors.newFixedThreadPool(10);
        System.out.println("startTime" + startTime);
        for(int i = 0; i < 100; i++) {
            fixedThreadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(3000);
                    System.out.println("Thread completed execution at " + (Time.valueOf(LocalTime.now())));
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
        }
        //As there are 100 tasks, each tasks take 3 secs and threadpool size is 10
        //Program should take aroudn 30 secs to execute

        //Important
        fixedThreadPoolExecutor.shutdown();
    }
   
}
