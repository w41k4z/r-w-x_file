package fileActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Executor {

    public static File createNewFile(
            File root,
            String fileName,
            boolean isDirectory) throws Exception {
        if (!root.isDirectory())
            throw new Exception("The first parameter has to be a directory");
        File file = new File(root, fileName);
        if (isDirectory) {
            file.mkdir();
        } else {
            file.createNewFile();
        }
        return file;
    }

    public static void clearFile(File file) throws Exception {
        new FileOutputStream(file).close();
    }

    public static void deleteFile(File file) throws Exception {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            for (int i = 0; i < children.length; i++) {
                deleteFile(children[i]);
            }
        }
        file.delete();
    }

    public static File[] getFileTree(File file) throws Exception {
        ArrayList<File> files = new ArrayList<>();
        files.add(file);
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            for (int i = 0; i < children.length; i++) {
                for (File grandChildren : getFileTree(children[i])) {
                    files.add(grandChildren);
                }
            }
        }
        return files.toArray(new File[files.size()]);
    }
}
