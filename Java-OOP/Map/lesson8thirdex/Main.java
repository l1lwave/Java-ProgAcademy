package lesson8thirdex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Alphabet alphabet = new Alphabet();
		
		System.out.println("Input some text: ");
		String input = sc.nextLine();
		
		System.out.println(alphabet.print(input));
	}

}
