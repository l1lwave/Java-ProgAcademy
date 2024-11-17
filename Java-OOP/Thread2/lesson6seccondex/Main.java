package lesson6seccondex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Input file in: ");
    	String folderInText = sc.nextLine();
    	System.out.println("Input folder out: ");
    	String folderOutText = sc.nextLine();
    	
		File file = new File(folderInText);
		File folderOut = new File(folderOutText);
		folderOut.mkdirs();

		try {
			FileService.copy(folderOut, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}
}