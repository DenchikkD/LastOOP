package lessons14.fibanachi;

/**
 * Created by Denni on 26.06.2016.
 */
public class Worker implements Runnable {
    private long number;
    private boolean isALive = true;
    private long fibanachi;
    private double f1 = ((1 + Math.sqrt(5)) / 2);
    private double f2 = ((1 - Math.sqrt(5)) / 2);
    private double f3 = Math.sqrt(5);
    private int count;
    private int step = 50;
    private boolean issFound;

    public void setALive(boolean ALive) {
        isALive = ALive;
    }

    public Worker(int count, long number) {
        this.count = count;
        this.number = number;

    }

    /**
     *
     */

    @Override
    public void run() {
        int idx = 0;

        while (isALive) {

            if (issFound || idx >= step) {
                try {
                    System.out.println(Thread.currentThread().getName() + "work  " + count);

                    isALive = false;
                    Thread.currentThread().sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                fibanachi = (long) ((Math.pow(f1, count) - Math.pow(f2, count)) / f3);
//                System.out.println(Thread.currentThread().getName()+" "+fibanachi);
                if (fibanachi == number) {
                    issFound = true;
                    Main.isFound = true;
                    System.out.println(Thread.currentThread().getName() + "work  " + count);


                }
                count++;
                idx++;
            }
        }
    }
}

