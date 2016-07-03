package lessons12.homeTaskFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denni on 23.06.2016.
 */
public class FileMainTest {

    private FileSeach fileSeach = new FileSeach();

    @Deprecated
    public static void main(String[] args) {

        FileMainTest fileMainTest = new FileMainTest();


        File path = new File("D:\\OOP");
        String fileName = "testDirectory";

        List<File> fileList = new ArrayList<File>();
        if (path.isDirectory()) {
            fileMainTest.fileSeach.search(path, fileName, fileList);
        }

        if (fileList.size() == 0) {
            System.out.println("File not founding");
        } else {
            for (File list : fileList) {
                System.out.println(list.getAbsoluteFile());

            }
        }


    }

}

