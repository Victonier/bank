/*
 * Helper file to read from a file and catch any exceptions
 */

package fancybank.data;

import java.io.File;
import java.util.Scanner;

import fancybank.utils.Util;

public interface ReadJsonFile {

    public static String readFile(String filePath) {
        if (Util.isFileExist(filePath)) {
            StringBuilder str = new StringBuilder();
            try {
                Scanner scanner = new Scanner(new File(filePath));
                while (scanner.hasNextLine()) {
                    str.append(scanner.nextLine().trim());
                }
                scanner.close();
                return str.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }

}
