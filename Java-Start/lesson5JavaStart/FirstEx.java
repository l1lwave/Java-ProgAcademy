package lesson5JavaStart;

import java.util.Scanner;

public class FirstEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input text: ");
		String text = sc.nextLine();
		
		char[] symbols = text.toCharArray();
		int count = 0;
		
		for(int i = 0; i < symbols.length; i++) {
			if(symbols[i] == 'b') {
				count++;
			}		 
		}
		
		System.out.println(count);
	}      
}
