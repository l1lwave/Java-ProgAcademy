package lesson7JavaStart;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FifthEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input way: ");
		String way = sc.nextLine();
		String text = getStringFromFile(way); 
		text = text.toLowerCase();
	    countSymbols(text);
	}
	
	public static String getStringFromFile(String way) {
		File file = new File(way);
		StringBuilder sb = new StringBuilder();
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				sb.append(sc.nextLine()).append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	return sb.substring(0, sb.length() - 1);
	}
	
	public static void countSymbols(String text) {
		int[] frequency = new int[26];
		char[] letters = new char[26];
		text = text.toLowerCase();
		int countVowels = 0;
	    char[] symbols = text.toCharArray();
	    for (int i = 0; i < symbols.length; i++) {
	    	 if (symbols[i] >= 'a' && symbols[i] <= 'z') { 
                 frequency[symbols[i] - 'a']++;
             }
	    }
	    sortText(letters, frequency);
	    
	    for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                System.out.println(letters[i] + " - " + frequency[i]);
            }
        }
	}
	
	public static void sortText(char[] letters, int[] frequency) {
        for (int i = 0; i < 26; i++) {
            letters[i] = (char) (i + 'a');
        }
        
        for (int i = 0; i < 26 - 1; i++) {
            for (int j = i + 1; j < 26; j++) {
                if (frequency[i] < frequency[j]) {
                    int tempFreq = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = tempFreq;
                    
                    char tempLetter = letters[i];
                    letters[i] = letters[j];
                    letters[j] = tempLetter;
                }
            }
        }
	}
}
