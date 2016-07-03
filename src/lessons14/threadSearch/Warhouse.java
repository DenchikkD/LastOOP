package lessons14.threadSearch;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Denni on 25.06.2016.
 */
public class Warhouse {
    private static final int FIRST_INDEX = 0;
    private String fileName;
    private List<File> resources;
    private List<File> fiendFiles;

    public Warhouse(String fileName, File roodDir) {
        this.fileName = fileName.toLowerCase();

        resources = new LinkedList<File>();
        resources.add(roodDir);
        fiendFiles = new LinkedList<File>();

    }

    public synchronized File getResources() {
        if (!resources.isEmpty()) {
            return resources.remove(FIRST_INDEX);
        }
        return null;
    }

    public synchronized void addResources(File[] arrFiles) {
        for (File file : arrFiles) {
            resources.add(file);
        }
    }

    public synchronized void addFiendFile(File file) {

        fiendFiles.add(file);
    }


    public List<File> getFiendFiles() {
        return fiendFiles;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
