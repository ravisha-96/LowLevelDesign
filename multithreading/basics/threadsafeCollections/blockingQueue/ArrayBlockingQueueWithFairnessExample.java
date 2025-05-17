package multithreading.basics.threadsafeCollections.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/*
 Opt for enabling fairness in ArrayBlockingQueue when:

    1. You have multiple threads that need equitable access to the queue.

    2. Preventing thread starvation is critical for your application's correctness.

    3. The slight performance overhead is acceptable in your use case.

In contrast, if performance is a higher priority and thread starvation is not a concern, you might choose to disable fairness.
 */
public class ArrayBlockingQueueWithFairnessExample {
    public static void main(String[] args) {
        // Create a queue with capacity of 10 and fairness enabled
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10, true);
        
        // Producer thread
        new Thread(() -> {
            try {
                for (int i = 0; i < 15; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
        
        // Consumer thread
        new Thread(() -> {
            try {
                for (int i = 0; i < 15; i++) {
                    Thread.sleep(2000);
                    Integer value = queue.take();
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}

