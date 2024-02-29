/*
 * Herlper class to write to a file and catch any exceptions
 */

package fancybank.data;

import java.io.File;
import java.io.FileWriter;

public interface WriteJsonFile {

    public static boolean writeFile(String filePath, String content) {
        File f = new File(filePath);
        try {
            f.createNewFile();
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
