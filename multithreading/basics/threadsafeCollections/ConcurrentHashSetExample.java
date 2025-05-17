package multithreading.basics.threadsafeCollections;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashSetExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashSet using ConcurrentHashMap
        Set<Integer> concurrentHashSet = Collections.newSetFromMap(new ConcurrentHashMap<>());

        // Add elements to the set
        // concurrentHashSet.add(1);
        // concurrentHashSet.add(2);
        // concurrentHashSet.add(3);

        // Create threads to demonstrate thread-safe operations
        Thread t1 = new Thread(() -> {
            for (int i = 4; i <= 10; i++) {
                concurrentHashSet.add(i);
                System.out.println("Thread 1 added: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = -5; i <= 14; i++) {
                if (concurrentHashSet.contains(i)) {
                    System.out.println("Thread 2 found: " + i);
                } else {
                    System.out.println("Thread 2 not found: " + i);
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Print the final set
        System.out.println("Final Set: " + concurrentHashSet);
    }
}