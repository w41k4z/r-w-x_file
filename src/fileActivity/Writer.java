package fileActivity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writer extends BufferedWriter {

    // constructor
    public Writer(File file) throws Exception {
        super(new FileWriter(file, true));
    }

    // method
    public void writeFile(Object[] data) throws Exception {
        for (int i = 0; i < data.length; i++) {
            this.write(data[i].toString());
            this.newLine();
        }
        this.flush();
        this.close();
    }
}
