package lesson5JavaStart;

import java.util.Scanner;

public class SeccondEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input text: ");
		String text = sc.nextLine();
		
		String[] result = text.split("[ ]");
		int maxWordCount = 0;
		String maxWord = "";
		if(!result[0].isEmpty()) {
			for (int i = 0; i < result.length; i++) {
				if(result[i].length() > maxWordCount) {
					maxWordCount = result[i].length();
					maxWord = result[i];
				}	
			}
			
			System.out.println("Max word is " + maxWord);
		} else {
			System.out.println("Error. Input text again.");
		}
	}     
}
