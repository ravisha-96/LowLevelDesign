package multithreading.basics.executors;

import java.sql.Time;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExecutor {
    private static Time startTime = Time.valueOf(LocalTime.now());
    public static void main(String[] args) {
        ExecutorService cachedThreadPoolExecutor = Executors.newCachedThreadPool();
        System.out.println("startTime" + startTime);
        for(int i = 0; i < 100; i++) {
            cachedThreadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(3000);
                    System.out.println("Thread completed execution at " + (Time.valueOf(LocalTime.now())));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        //As there are 100 tasks, each tasks take 3 secs, as there is no limit on the max number fo thread
        // in the pool, program should get executed in 3 sec only 
        //Program should take aroudn 30 secs to execute

        //Important
        cachedThreadPoolExecutor.shutdown();
        // fixedThreadPoolExecutor.shutdownNow();
    }
}
