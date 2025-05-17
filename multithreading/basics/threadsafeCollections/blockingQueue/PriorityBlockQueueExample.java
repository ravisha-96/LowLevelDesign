package multithreading.basics.threadsafeCollections.blockingQueue;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockQueueExample {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>(8);

        for(int i = 0; i < 10; i++) {
            if(!pq.offer(new Random().nextInt(100))) {
                System.out.println("Pq full, not inserted " + i);
            }
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(pq.poll());
        }
    }
}
