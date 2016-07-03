package lessons14;

/**
 * Created by Denni on 24.06.2016.
 */
public class SomeRunnableThread implements Runnable {
    @Override
    public void run() {


        try {
            Thread.currentThread().sleep(5000);
            System.out.println("Greetings from SomeRunnubleThread!");
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
