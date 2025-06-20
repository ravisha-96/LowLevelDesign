package multithreading.basics.threadsafeCollections;


import java.util.concurrent.ConcurrentLinkedDeque;

// ConcurrentLinkedDeque<E> is a thread-safe, non-blocking, unbounded double-ended queue (deque) in Java, part of the java.util.concurrent package.
// It allows elements to be added, removed, and accessed from both ends of the deque concurrently by multiple threads without blocking.

// 🔑 Key Features

// Thread-Safety: Operations such as addFirst(), addLast(), pollFirst(), and pollLast() are thread-safe and do not block.

// Non-Blocking: Utilizes lock-free algorithms, specifically compare-and-set (CAS), to ensure that operations do not block threads.

// Unbounded Capacity: The deque can grow dynamically to accommodate any number of elements, limited only by available memory.

// Weakly Consistent Iterators: Iterators reflect the state of the deque at or since the creation of the iterator. They do not throw ConcurrentModificationException and may proceed concurrently with other operations.

// No null Elements: Like most collections in Java, null elements are not permitted.
public class ConcurrentLinkedDequeExample {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> concQueue = new ConcurrentLinkedDeque<>();
        for(int i = 0; i < 10; i++) {
            concQueue.offerFirst(i);
            concQueue.offerLast(i);
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(concQueue.pollFirst());
            System.out.println(concQueue.pollLast());
        }
    }
}

/*⚠️ Considerations

    size() Method: Determining the number of elements requires traversing the entire deque, making it an O(n) operation.
    It may not reflect the current size if the deque is modified concurrently.

    Bulk Operations: Operations like addAll(), removeIf(), and forEach() are not guaranteed to be performed atomically.
    For example, a forEach traversal concurrent with an addAll operation might observe only some of the added elements.

    Memory Consumption: Each element in the deque consumes a node object.
    With high contention or a large number of elements, memory usage can increase significantly.
*/

/* ✅ When to Use

ConcurrentLinkedDeque is ideal for scenarios where:

    Multiple threads need to share a deque without blocking each other.

    The order of processing elements is important (FIFO).

    The deque's size can grow dynamically without predefined limits.

It's commonly used in producer-consumer scenarios, task scheduling, and implementing work-stealing algorithms.

*/