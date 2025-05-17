package multithreading.basics.threadsafeCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        // ConcurrentHashMap<Integer, Integer> conHashMap = new ConcurrentHashMap<>();
        
        //If we use normal hashmap, then exception will happen
        Map<Integer, Integer> conHashMap = new HashMap<>();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 30; i++) {
                if(i % 2 == 0) {
                    conHashMap.put(i, i);
                } else {
                    System.out.println(conHashMap.getOrDefault(new Random().nextInt(10), -1));
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 30; i++) {
                if(i % 2 == 0) {
                    conHashMap.put(i, i);
                } else {
                    System.out.println(conHashMap.getOrDefault(new Random().nextInt(10), -1));
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        System.out.println("program end");

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("This will be executed at last: " + "finally the program has ended");
    }
    
}
