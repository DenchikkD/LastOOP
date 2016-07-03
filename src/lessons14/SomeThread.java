package lessons14;

/**
 * Created by Denni on 24.06.2016.
 */
public class SomeThread extends Thread {

    @Override
    public void run() {
        try {
            currentThread().sleep(2000);
            System.out.println("Greetings from SomeThread!");
            System.out.println(currentThread().getName());
            currentThread().sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
