package lessons14.threadSearch;

import java.io.File;

/**
 * Created by Denni on 25.06.2016.
 */
public class Bomz implements Runnable {
    private Warhouse warhouse;

    public boolean isALiveBomz() {
        return isALiveBomz;
    }

    public void setALiveBomz(boolean ALiveBomz) {

        isALiveBomz = ALiveBomz;
    }

    private boolean isALiveBomz = true;

    public Bomz(Warhouse warhouse) {
        this.warhouse = warhouse;
    }

    @Override
    public void run() {
        while (isALiveBomz) {
            System.out.println(Thread.currentThread().getName() + " " + "i am work");
            File file = null;

            while (file == null) {
                try {
                    Thread.currentThread().sleep(1);
                    if (!isALiveBomz) {
                        break;
                    }
                } catch (InterruptedException e) {
                    isALiveBomz = false;

                    e.printStackTrace();
                    break;
                }
                file = warhouse.getResources();
            }

            if (file != null) {
                if (file.getName().toLowerCase().contains(warhouse.getFileName())) {
                    System.out.println(Thread.currentThread().getName() + "  " + file.getAbsolutePath());
                    warhouse.addFiendFile(file);
                }

                if (file.isDirectory()) {
                    warhouse.addResources(file.listFiles());
                }
            }

        }
        System.out.println(Thread.currentThread().getName() + " " + "i am die");


    }
}
