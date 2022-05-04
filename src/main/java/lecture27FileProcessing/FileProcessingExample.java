package lecture27FileProcessing;

import java.io.File;

public class FileProcessingExample {
    /** Prints the names of all files in a given directory (on the top level,
     * without going into subdirectories
     * @param directory directory where the method searches for files
     */
    public static void processFiles(String directory) {
        File dir = new File(directory);
        for (File file: dir.listFiles()) {
            System.out.println(file);
        }
    }

    public static void main(String[] args) {
        processFiles("src/main/java/lecture27FileProcessing");
    }

    }
