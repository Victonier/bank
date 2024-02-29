/*
 * Utils and need to be used in other classes
 */

package fancybank.utils;

import java.io.File;

public class Util {

    public static boolean isFileExist(String filePath) {
        File f = new File(filePath);
        return (f.exists() && !f.isDirectory());
    }

}
