package multithreading.basics.threadsafeCollections.blockingQueue;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

/*
 * 🔄 Key Differences
    Method	Blocks on Full Queue	Return Type	    Throws Exception
    put()	    Yes	                        void	        NullPointerException
    offer()	    No	                        boolean	        NullPointerException
 */
public class PriorityBlockQueueExample {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>(8);
        for(int i = 0; i < 10; i++) {
            pq.put(new Random().nextInt(100));
            
        }
        for(int i = 0; i < 10; i++) {
            try {
                System.out.println(pq.take());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
