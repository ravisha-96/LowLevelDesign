package multithreading.producerConsumer;

import java.util.LinkedList;

public class ProducerConsumerManual {
    private static final int CAPACITY = 5;
    private static final LinkedList<Integer> buffer = new LinkedList<>();

    static class Producer implements Runnable {
        public void run() {
            int value = 0;
            for(int i = 0; i < 25; i++){
                synchronized (buffer) {
                    while (buffer.size() == CAPACITY) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    buffer.add(value);
                    System.out.println("Produced " + value++);
                    buffer.notifyAll();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        public void run() {
            for(int i = 0; i < 21; i++){ //Program will not terminate if the consumer is running more than the producer
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    int value = buffer.removeFirst();
                    System.out.println("Consumed " + value);
                    buffer.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }
}
