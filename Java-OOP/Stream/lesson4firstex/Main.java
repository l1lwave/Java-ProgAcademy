package lesson4firstex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Input folder in: ");
    	String folderInText = sc.nextLine();
    	System.out.println("Input folder out: ");
    	String folderOutText = sc.nextLine();
    	System.out.println("Input extension: ");
    	String extension = sc.nextLine();

        try {
        	File folderIn = new File(folderInText);

            File folderOut = new File(folderOutText);
            folderOut.mkdirs();

        	long copiedFiles = FileService.copyFiles(folderIn, folderOut, extension);
            System.out.println("Copy files: " + copiedFiles);
            
          } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
          }	  
        
        sc.close();
    }
}
	





