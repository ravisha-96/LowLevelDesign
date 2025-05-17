package multithreading.basics.threadsafeCollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// CopyOnWriteArrayList

//     1. Use Case: Ideal for scenarios where read operations vastly outnumber write operations.

//     2. How It Works: Each modification (e.g., add, remove) creates a new copy of the underlying array, ensuring thread safety without locking.

//     3. Advantages: No need for explicit synchronization during reads; iterators are weakly consistent.

//     4. Considerations: Write operations are more expensive due to array copying.
public class CoyOnWriteArrayListExample {
    public static void main(String[] args) {
        List<Integer> copyOnWriteList = new CopyOnWriteArrayList<>();

        for(int i = 0; i < 10; i++) {
            //Write operation will create a new arrayList
            copyOnWriteList.add(i);
        }

        for(int i = 0; i < 10; i++) {
            //Read operation can be concurrent
            System.out.println(copyOnWriteList.get(i));
        }
    }
}
