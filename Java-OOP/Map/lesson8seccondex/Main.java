package lesson8seccondex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Английско-Украинский словарь
		Dictionary engUkr = new Dictionary();
		
		engUkr.addWord("Hello", "Привіт");
		engUkr.addWord("Fire", "Вогонь");
		engUkr.addWord("Banana", "Банан");
		engUkr.addWord("Window", "Вікно");
		
		System.out.println("1. Show dictionary");
		System.out.println("2. Add word + translation");
		System.out.println("3. Remove word + translation");
		System.out.println("4. Find translation by word");
		System.out.println("5. Save dictionary to CSV");
		System.out.println("6. Load dictionary from CSV");
		
		for(; true ;) {
			System.out.println("Select option: ");
			int x = sc.nextInt();
	        sc.nextLine();
			if(x == 1) {
				System.out.println(engUkr.toString());
			} else if(x == 2) {
				System.out.println("Input word: ");
				String word = sc.nextLine();
				System.out.println("Input translation: ");
				String translation = sc.nextLine();
				engUkr.addWord(word, translation);
				System.out.println(engUkr.toString());
			} else if (x == 3) {
				System.out.println("Input word to remove: ");
				String word = sc.nextLine();
				engUkr.deleteWord(word);
				System.out.println(engUkr.toString());
			} else if (x == 4) {
				System.out.println("Input word to find translation: ");
				String word = sc.nextLine();
				System.out.println("Translation: " + engUkr.findTranslation(word));
			} else if (x == 5) {
				System.out.println("Input file Path: ");
				String filePath = sc.nextLine();
				engUkr.saveDictionary(filePath);
			} else if (x == 6) {
				System.out.println("Input file Path: ");
				String filePath = sc.nextLine();
				engUkr.loadFromCSV(filePath);
			}
		}
	}
}
