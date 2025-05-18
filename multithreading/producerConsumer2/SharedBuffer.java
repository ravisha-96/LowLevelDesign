package multithreading.producerConsumer2;

import java.util.LinkedList;

public class SharedBuffer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int value) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait(); // wait if buffer is full
            }
            buffer.add(value);
            System.out.println("Produced: " + value);
            notifyAll(); // notify waiting consumers
        }
    }

    public int consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait(); // wait if buffer is empty
            }
            int value = buffer.removeFirst();
            System.out.println("Consumed: " + value);
            notifyAll(); // notify waiting producers
            return value;
        }
    }
}
