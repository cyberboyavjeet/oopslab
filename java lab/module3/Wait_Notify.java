import java.util.LinkedList;
import java.util.Queue;

// ============================================
//  1. SHARED BUFFER
// ============================================
class SharedBuffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int maxSize;

    public SharedBuffer(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while(queue.size() == maxSize) {
            System.out.println("Buffer FULL! Producer waiting...");
            wait();
        }
        queue.add(item);
        System.out.println("Produced: " + item + " | Buffer: " + queue);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while(queue.isEmpty()) {
            System.out.println("Buffer EMPTY! Consumer waiting...");
            wait();
        }
        int item = queue.poll();
        System.out.println("Consumed: " + item + " | Buffer: " + queue);
        notify();
    }
}

// ============================================
//  2. PRODUCER THREAD
// ============================================
class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int item = 1;
        while(!isInterrupted()) {
            try {
                buffer.produce(item++);
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println("Producer stopped.");
                break;
            }
        }
    }
}

// ============================================
//  3. CONSUMER THREAD
// ============================================
class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while(!isInterrupted()) {
            try {
                buffer.consume();
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Consumer stopped.");
                break;
            }
        }
    }
}

// ============================================
//  4. MAIN CLASS
// ============================================
public class Wait_Notify{
    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== Inter-Thread Communication ===\n");

        SharedBuffer buffer = new SharedBuffer(3);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

        Thread.sleep(10000); // Run for 10 seconds

        producer.interrupt();
        consumer.interrupt();

        System.out.println("\n=== Program Ended ===");
    }
}