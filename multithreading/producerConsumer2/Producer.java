package multithreading.producerConsumer2;

public class Producer implements Runnable {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int value = 0;
        while (value < 20) {
            try {
                buffer.produce(value++);
                Thread.sleep(500); // simulate production delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}