package lesson6thirdex;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String directoryPath = "/home/kirill/Documents/";
        String fileNameToFind = "sql";
        List<File> foundFiles = new ArrayList<>();

        File directory = new File(directoryPath);
        Thread searchThread = new Thread(new Search(directory, fileNameToFind, foundFiles));
        searchThread.start();

        try {
            searchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (File file : foundFiles) {
            System.out.println("Found: " + file.getAbsolutePath());
        }
    }
}

