package lesson5JavaStart;

import java.util.Scanner;

public class FifthEx {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What did Vovochka write: ");
		String text = sc.nextLine();
		
		String word;
		char a;
		char b;
		
		for (int i = 1; i < text.length(); i++) {
			word = text.substring(0,i).toLowerCase();
			a = text.charAt(i);
			b = text.charAt(text.length() - i);
			
			if (text.endsWith(word) && a == b) {
				System.out.println("Vovochka write: "+ word);
				break;
			}
		}
	}
}
