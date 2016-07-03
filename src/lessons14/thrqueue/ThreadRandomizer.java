package lessons14.thrqueue;

/**
 * Created by Denni on 24.06.2016.
 */
public class ThreadRandomizer {

    private ThreadRandomizer() {
    }

    public static void randomThread(ThreadGroup group,Long malls) {
        Thread thread = new Thread(group,new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(malls);
                    ThreadSafe safe = new ThreadSafe();
                    safe.add(Thread.currentThread().getName() + " " + malls);
                    System.out.println("Add Log:{ " + Thread.currentThread().getName() + " " + malls + "}");
                    Thread.currentThread().sleep(malls);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        thread.start();
    }

}
