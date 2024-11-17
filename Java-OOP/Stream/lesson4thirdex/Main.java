package lesson4thirdex;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileWayfirst = null;
		String fileWayseccond = null;
		FileEquels fe = new FileEquels();
		
		if (args.length >= 2) {
            fileWayfirst = args[0];
            fileWayseccond = args[1];
		} else { 
			try {
			System.out.println("Input first file way: ");
			fileWayfirst = sc.nextLine();
			System.out.println("Input seccond file way: ");
			fileWayseccond = sc.nextLine();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		}
		
		
		File fileFirst = new File(fileWayfirst);
		File fileSeccond = new File(fileWayseccond);
		
		if(!fileFirst.exists() || !fileSeccond.exists()) {
			System.out.println("File does not exist");
			System.exit(0);
		}
		
		if (fe.isFilesEqual(fileFirst, fileSeccond)) {
			System.out.println("File 1 is equels File 2.");
		} else {
			System.out.println("No equels.");
		}
		
		sc.close();
	}

}
