package lessons13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created by Denni on 22.06.2016.
 */
public class ExeptionEx02 {


    public static void ioexeption() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) throws FileNotFoundException, FileAlreadyExistsException {
        try {
            ioexeption();
        } catch (IOException e) {
            FileNotFoundException exc = new FileNotFoundException("ERROR");
            exc.initCause(e);
            try {
                throw exc;
            } catch (FileNotFoundException ex) {
                FileAlreadyExistsException already = new FileAlreadyExistsException("IS ALIVE");
                already.initCause(ex);
                throw already;
            }

        }

    }
}

