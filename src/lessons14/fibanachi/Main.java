package lessons14.fibanachi;

/**
 * Created by Denni on 26.06.2016.
 */
public class Main {
    public static boolean isFound = false;

    public static void main(String[] args) {
long b=37889062373144008l;

        Worker worker1 = new Worker(0, b);
        Worker worker2 = new Worker(50, b);
        Worker worker3 = new Worker(100, b);
        Thread thread1 = new Thread(worker1);
        Thread thread2 = new Thread(worker2);
        Thread thread3 = new Thread(worker3);
        thread1.setName("worker 1");
        thread2.setName("worker 2");
        thread3.setName("worker 3");
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            while (!isFound) {
                Thread.currentThread().sleep(100);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
