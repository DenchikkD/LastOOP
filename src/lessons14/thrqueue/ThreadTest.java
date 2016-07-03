package lessons14.thrqueue;

import java.util.Random;

/**
 * Created by Denni on 24.06.2016.
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("MainGroup");
        Random random = new Random();
        Thread add = new Thread(group, new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 250; i++) {

                    try {
                        Thread.currentThread().sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ThreadRandomizer.randomThread(group, new Long(random.nextInt(5000)));
                }
            }
        });
        add.start();
        Thread thread = new Thread(group, new Runnable() {
            @Override
            public void run() {
                ThreadSafe safe = new ThreadSafe();

                while (true) {
                    System.out.println("GET { " + safe.get() + "}");
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        while (group.activeCount() > 0) {
            System.out.println("********** ACTIVE THREADS : {" + group.activeCount() + "}**********");
            Thread.currentThread().sleep(15000);

        }
    }
}
