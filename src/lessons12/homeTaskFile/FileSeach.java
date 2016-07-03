package lessons12.homeTaskFile;


import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Denni on 23.06.2016.
 */
public class FileSeach {


    public void search(File path, @NotNull String fileName, List<File> files) {
//        System.out.println(path.getName());
        if (path.getName().toLowerCase().contains(fileName.toLowerCase())) {
            files.add(path);
        }
        if (path.isDirectory()) {
            File[] fileDears = path.listFiles();
            for (File file : fileDears) {
                search(file, fileName, files);
            }

        }

    }

}
