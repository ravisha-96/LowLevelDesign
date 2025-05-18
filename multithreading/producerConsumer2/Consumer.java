package multithreading.producerConsumer2;

public class Consumer implements Runnable {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                buffer.consume();
                Thread.sleep(800); // simulate consumption delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}