package lessons13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;

/**
 * Created by Denni on 22.06.2016.
 */
public class ExceptionEx03 {

    public static void fileNotFound() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void already() {
        throw new FileSystemAlreadyExistsException();

    }

    public static void io() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            fileNotFound();
            already();
            io();
        } catch (FileNotFoundException ext) {
            ext.printStackTrace();
        } catch (FileAlreadyExistsException ext) {
            ext.printStackTrace();
        } catch (IOException ext) {
            ext.printStackTrace();
        }
    }
}
