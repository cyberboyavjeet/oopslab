class MyTask implements Runnable {
    String name;

    MyTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " is running: " + i);
        }
    }
}

public class Runable {
    public static void main(String[] args) {

        MyTask task1 = new MyTask("Thread A");
        MyTask task2 = new MyTask("Thread B");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
} 