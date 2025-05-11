package multithreading.basics.executors;

import java.sql.Time;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    private static Time startTime = Time.valueOf(LocalTime.now());
    public static void main(String[] args) {
        ExecutorService singleThreadPoolExecutor = Executors.newSingleThreadExecutor();
        System.out.println("startTime" + startTime);
        for(int i = 0; i < 100; i++) {
            singleThreadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(100);
                    System.out.println("Thread completed execution at " + (Time.valueOf(LocalTime.now())));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        //As there are 100 tasks, each tasks take 0.1 secs and threadpool size is always
        //Program should take around 10 secs to execute
        

        //It offers no concurrency
        //When to use -> when need to process tasks sequentially
        //Important
        singleThreadPoolExecutor.shutdown();
        // fixedThreadPoolExecutor.shutdownNow();
    }
   
}
