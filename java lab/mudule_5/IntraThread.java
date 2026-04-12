class Shared {
    int data; boolean ready = false;
    synchronized void produce(int val) throws Exception {
        data = val; ready = true;
        System.out.println("Produced: " + val);
        notify();
    }
    synchronized void consume() throws Exception {
        while (!ready) wait();
        System.out.println("Consumed: " + data);
    }
}
public class IntraThread {
    public static void main(String[] args) {
        Shared s = new Shared();
        new Thread(() -> { try { s.produce(42); } catch(Exception e){} }).start();
        new Thread(() -> { try { s.consume(); } catch(Exception e){} }).start();
    }
}
