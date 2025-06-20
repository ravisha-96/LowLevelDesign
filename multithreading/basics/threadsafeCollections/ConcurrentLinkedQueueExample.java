package multithreading.basics.threadsafeCollections;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

//ConcurrentLinkedQueue<E> is a thread-safe, non-blocking, unbounded queue in Java, part of the java.util.concurrent package. 
// It implements the Queue<E> interface and is designed for high-concurrency scenarios where multiple threads need to add and remove elements 
// without blocking each other.


//Key Features

// Non-blocking Operations: Utilizes lock-free algorithms, specifically compare-and-set (CAS), to ensure that operations like add(), poll(), and peek()
// do not block threads. This makes it suitable for high-concurrency environments.

// FIFO Ordering: Maintains a First-In-First-Out order, ensuring that elements are processed in the order they were added.

// Unbounded Capacity: The queue can grow dynamically to accommodate any number of elements, limited only by available memory.

// Weakly Consistent Iterators: Iterators reflect the state of the queue at or since the creation of the iterator.

// They do not throw ConcurrentModificationException and may proceed concurrently with other operations.

// No null Elements: Like most collections in Java, null elements are not permitted
public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        Queue<Integer> concQueue = new ConcurrentLinkedQueue<>();
        for(int i = 0; i < 10; i++) {
            concQueue.offer(i);
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(concQueue.poll());
        }
    }
}

// ✅ When to Use

//ConcurrentLinkedQueue is ideal for scenarios where:

// 1. Multiple threads need to share a queue without blocking each other.

// 2. The order of processing elements is important (FIFO).

// 3. The queue's size can grow dynamically without predefined limits.