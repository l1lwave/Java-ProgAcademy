package lesson7JavaStart;

import java.io.File;
import java.util.Scanner;


public class ThirdEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input way: ");
		String way = sc.nextLine();
	   	listDirectories(way);
    }
    
	public static void listDirectories(String directoryPath) {
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
            	for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        System.out.println(files[i].getName());
                    }
                }
            } else {
                System.out.println("Error.");
            }
        } else {
            System.out.println("This way isn't directory or not exists.");
        }
    }

}
