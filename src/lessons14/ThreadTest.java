package lessons14;

/**
 * Created by Denni on 24.06.2016.
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {

        ThreadGroup group = new ThreadGroup("Main");

        SomeThread thread = new SomeThread();
        thread.start();
        System.out.println(thread.getName() + " " + thread.isAlive());


        Thread thread2 = new Thread(group, new SomeThread());
        thread2.start();

        Thread thr = new Thread(group, new SomeRunnableThread());
        thr.start();

//        Thread.currentThread().sleep(6000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
//        System.out.println(thread.getName() + " " + thread.isAlive());

        System.out.println(thread2.getName() + " " + thread.isAlive());
        System.out.println(thr.getName() + " " + thread.isAlive());
        while (group.activeCount()>0){
            Thread.currentThread().sleep(1500);

        }
        System.out.println(thread2.getName() + " " + thread.isAlive());
        System.out.println(thr.getName() + " " + thread.isAlive());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }
}
