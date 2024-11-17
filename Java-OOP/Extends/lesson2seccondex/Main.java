package lesson2seccondex;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TextTransformer uppercase = new TextTransformer();
		InverseTransformer inverse = new InverseTransformer();
		UpDownTransformer updown = new UpDownTransformer();
		
		System.out.println("Input your string: ");
		String text = sc.nextLine();
				
		System.out.println("Input file name: ");
		String f = sc.nextLine();
		File file = new File(f);
		
		System.out.println("Choose transform: ");
		System.out.println("1) to Upper Case");
		System.out.println("2) to Reverse");
		System.out.println("3) to UpDown Case");
		int x = sc.nextInt();
		
		if(x == 1) {
			TextTransformer transformer = uppercase;
			TextSaver textsaver = new TextSaver(transformer, file);
			textsaver.saveTextToFile(text);
			System.out.println("Done");
		}else if(x == 2) {
			TextTransformer transformer = inverse;
			TextSaver textsaver = new TextSaver(transformer, file);
			textsaver.saveTextToFile(text);
			System.out.println("Done");
		}else if(x == 3) {
			TextTransformer transformer = updown;
			TextSaver textsaver = new TextSaver(transformer, file);
			textsaver.saveTextToFile(text);
			System.out.println("Done");
		}else {
			System.out.println("error");
		}
		
		sc.close();
		
	}

}
