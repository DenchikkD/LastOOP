package lessons14.threadSearch;

import lessons12.homeTaskFile.FileMainTest;
import lessons12.homeTaskFile.FileSeach;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denni on 24.06.2016.
 */
public class ThreadMain {


    public static void main(String[] args) {


        File path = new File("D:\\OOP");
        String fileName = "testDirectory";
        Warhouse warhouse = null;


        if (path.isDirectory()) {

            warhouse = new Warhouse(fileName, path);
            Bomz bomz1 = new Bomz(warhouse);
            Bomz bomz2 = new Bomz(warhouse);
            Bomz bomz3 = new Bomz(warhouse);
            Thread thread1 = new Thread(bomz1);
            Thread thread2 = new Thread(bomz2);
            Thread thread3 = new Thread(bomz3);
            thread1.setName("Bomz-1");
            thread2.setName("Bomz-2");
            thread3.setName("Bomz-3");

            thread1.start();
            thread2.start();
            thread3.start();

            try {
                Thread.currentThread().sleep(5);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bomz1.setALiveBomz(false);
            bomz2.setALiveBomz(false);
            bomz3.setALiveBomz(false);
        }

        if (warhouse.getFiendFiles().size() == 0) {
            System.out.println("File not founding");
        } else {
            for (File list : warhouse.getFiendFiles()) {
                System.out.println(list.getAbsoluteFile());

            }
        }


    }

}
