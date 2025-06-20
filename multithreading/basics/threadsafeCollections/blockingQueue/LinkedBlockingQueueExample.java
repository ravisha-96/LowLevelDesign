package multithreading.basics.threadsafeCollections.blockingQueue;

import java.util.concurrent.LinkedBlockingQueue;
/*
 * | Feature               | `ArrayBlockingQueue`                | `LinkedBlockingQueue`             
| --------------------- | ----------------------------------- | ---------------------------------- | 
| **Backing Structure** | Fixed-size array                    | Linked nodes                       |
| **Capacity**          | Fixed capacity                      | Fixed or unbounded                 |
| **Fairness Policy**   | Optional (via constructor)          | Not supported                      |
| **Locking Mechanism** | Single lock for both read and write | Separate locks for read and write  |
| **Memory Usage**      | Fixed overhead                      | Dynamic overhead based on size     |
| **Performance**       | Better for small, fixed-size queues | Better for large or dynamic queues |

When to use LinkedBlockingQueue instead of ArrayBlockingQueue?
When to Use LinkedBlockingQueue

    Dynamic Workloads: When the number of tasks or elements is unpredictable or can vary significantly.
    CodingTechRoom+1CodingTechRoom+1

    High Concurrency: In applications with many producer and consumer threads, where separate locks for read and write operations can reduce contention.

    Unbounded Capacity: If you prefer not to set a fixed capacity and are willing to handle potential memory usage concerns.

    Scalability: Suitable for systems that need to scale dynamically with the workload.

Example: A web server handling varying numbers of incoming requests, where the number of requests can fluctuate based on traffic

✅ When to Use ArrayBlockingQueue

    Fixed Workloads: When the number of tasks or elements is known and limited.
    CodingTechRoom+1CodingTechRoom+1

    Memory Efficiency: In memory-constrained environments where a fixed-size queue can prevent excessive memory usage.

    Low Latency: When low-latency operations are critical, and the overhead of dynamic memory allocation is undesirable.

    Fairness Requirement: If you need to ensure that threads acquire access to the queue in the order they requested (FIFO).

Example: A task scheduler with a fixed number of worker threads processing a known set of tasks


⚠️ Considerations

    Memory Usage: LinkedBlockingQueue can consume more memory due to dynamic node allocation, especially if the queue grows large.

    Performance Variability: ArrayBlockingQueue may offer more predictable performance due to its fixed size and simpler structure.
    CodingTechRoom

    Fairness: ArrayBlockingQueue allows for optional fairness, which can be important in scenarios where thread starvation is a concern.
 */
public class LinkedBlockingQueueExample {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> lbQ = new LinkedBlockingQueue<>();

        for(int i = 0; i < 10; i++) {
            try {
                lbQ.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(int i = 0; i < 10; i++) {
            try {
                System.out.println(lbQ.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
