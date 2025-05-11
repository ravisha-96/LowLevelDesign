package multithreading.basics.executors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
            2,
            5,
            1,
            TimeUnit.HOURS,
            new ArrayBlockingQueue<>(10),
            new CustomThreadFactory(),
            new CustomRejectedHandler());

        //submit task
        for(int i = 0; i < 25; i++) {
            poolExecutor.submit(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Thread name: " + Thread.currentThread().getName());
                }catch(Exception e) {

                }
            });
        }

        poolExecutor.shutdown();
    }
}

class CustomRejectedHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        //logging
        System.out.println("Task Denied: " + r.toString());
    }
}

class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        return th;
    }
}
