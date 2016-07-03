package lessons12;

import sun.java2d.pipe.SpanShapeRenderer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Denni on 17.06.2016.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {

        File directory = new File("D:\\OOP/testDirectory");
        if (!directory.exists()) {
            directory.mkdir();
        }

        File dirs = new File("D:\\OOP/testDirectory/mkTest/dirs");
        if (!dirs.exists()) {
            dirs.mkdirs();

        }
//        System.out.println(dirs.getPath());

        File file1 = new File("D:\\OOP/testDirectory", "test.dat");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        File file2 = new File(dirs, "test1.dat");
        if (!file2.exists()) {
            file2.createNewFile();
        }


        File delDir = new File(directory, "delDir");
        if (!delDir.exists()) {
            delDir.mkdir();


        }
        File delFile = new File(directory, "delFile.del");
        if (!delFile.exists()) {
            delFile.createNewFile();
        }
//        delDir.delete();   // удалено
//        delFile.delete(); // удалено

//        directory.delete();   //  не удалено
        printDirs(directory);
//        deleteFile(directory);


        File lastModifity = new File(directory, "lastModife.dat");
        lastModifity.createNewFile();

        System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(lastModifity.lastModified()));

        if (lastModifity.canWrite()) {
            FileWriter fileWriter = new FileWriter(lastModifity);

            for (int i = 0; i < 10; i++) {
                fileWriter.write("String " + i + "\n");

            }
            fileWriter.flush();
            fileWriter.close();
        }
        lastModifity.setLastModified(System.currentTimeMillis());
        System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(lastModifity.lastModified()));

        FileReader fileReader = new FileReader("D:\\OOP/testDirectory/lastModife.dat");
        Scanner scn = new Scanner(fileReader);
        while (scn.hasNextLine()) {
            System.out.println(scn.nextLine());
        }

    }


    public static void deleteFile(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.exists()) {
                    deleteFile(file);
                } else {
                    file.delete();
                }
            }

        }

        directory.delete();
        return;
    }

    public static void printDirs(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {

                    if (file.isDirectory()) {
                        printDirs(file);
                    } else {
                        System.out.println(file.getAbsoluteFile());
                    }
                }
            }

        }
        return;
    }


}
