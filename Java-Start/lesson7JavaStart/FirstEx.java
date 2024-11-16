package lesson7JavaStart;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class FirstEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("textRedaktor.txt");
		
		System.out.println("Input some text. Press Enter to save.");
		String text = sc.nextLine();
		
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
