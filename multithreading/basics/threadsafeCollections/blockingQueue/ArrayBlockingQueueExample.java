package multithreading.basics.threadsafeCollections.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        // Create a queue with capacity of 10 and fairness enabled
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10, false);
        
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
        new 
    }
}
