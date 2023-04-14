package fileActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Reader extends BufferedReader {

    // constructor
    public Reader(File file) throws Exception {
        super(new FileReader(file));
    }

    // methods
    public ArrayList<String> readFile(boolean toClose) throws Exception {
        ArrayList<String> data = new ArrayList<>();
        String dt = this.readLine();
        while (dt != null) {
            data.add(dt);
            dt = this.readLine();
        }
        if (toClose)
            this.close();

        return data;
    }

    public String readFile(boolean toClose, boolean toString) throws Exception {
        if (toString) {
            StringBuilder stringBuilder = new StringBuilder("");
            for (String line : this.readFile(toClose)) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public boolean contains(String string, boolean toClose) throws Exception {
        ArrayList<String> data = this.readFile(toClose);
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).contains(string)) {
                return true;
            }
        }
        return false;
    }
}