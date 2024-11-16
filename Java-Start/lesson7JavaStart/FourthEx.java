package lesson7JavaStart;

import java.io.File;
import java.util.Scanner;

public class FourthEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input way: ");
        String way = sc.nextLine();
        lengthFiles(way);
    }
    
    public static void lengthFiles(String way) {
        File file = new File(way);

        if (file.exists()) {
            File[] files = file.listFiles();
            
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isFile()) {
                        if (files[i].length() < 1024) {
                            System.out.println(files[i] + "\t" + files[i].length() + " B");
                        } else if (files[i].length() < 1024 * 1024) {
                            double sizeKB = files[i].length() / 1024.0;
                            System.out.println(files[i] + "\t" + String.format("%.2f KB", sizeKB));
                        } else if (files[i].length() < 1024 * 1024 * 1024) {
                            double sizeMB = files[i].length() / (1024.0 * 1024.0);
                            System.out.println(files[i].getName() + "\t" + String.format("%.2f MB", sizeMB));
                        } else if (files[i].length() < 1024L * 1024L * 1024L * 1024L) {
                            double sizeGB = files[i].length() / (1024.0 * 1024.0 * 1024.0);
                            System.out.println(files[i].getName() + "\t" + String.format("%.2f GB", sizeGB));
                        } else if (files[i].length() < 1024L * 1024L * 1024L * 1024L * 1024L) {
                            double sizeTB = files[i].length() / (1024.0 * 1024.0 * 1024.0 * 1024.0);
                            System.out.println(files[i].getName() + "\t" + String.format("%.2f TB", sizeTB));
                        }
                    }
                }
        } else {
            System.out.println("Error: Path does not exist.");
        }
    }
}
