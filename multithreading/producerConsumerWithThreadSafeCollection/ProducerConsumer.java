package multithreading.producerConsumerWithThreadSafeCollection;

import java.util.concurrent.*;

public class ProducerConsumer {
    private static final int CAPACITY = 5; //Mark all instance variables as static as the producer and consumer class is static
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(CAPACITY); // //Mark all instance variables as static as the producer and consumer class is static

    static class Producer implements Runnable {
        public void run() {
            int value = 0;
            try {
                for(int i = 0; i < 20; i++) {
                    System.out.println("Producing " + value);
                    queue.put(value++);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Consumer implements Runnable {
        public void run() {
            try {
                for(int i = 0; i < 20; i++){
                    int value = queue.take();
                    System.out.println("Consuming " + value);
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }
}
