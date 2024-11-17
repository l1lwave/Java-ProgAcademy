package lesson8firstex;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		System.out.println("Input file way: ");
		String way = sc.nextLine();

		try (FileReader fileReader = new FileReader(way)) {
            int character;
            while ((character = fileReader.read()) != -1) { 
            	if(Character.isLetter(character)) {
                list.add((char) character);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
		System.out.println(list);
		
		Map<Character, Integer> stat = new HashMap<>();
	    
	    for (Character ch : list) {
	    	Integer count = stat.getOrDefault(ch, 0);
	    	stat.put(ch, count+1);
	    }
	    
	    List<Entry<Character, Integer>> sortedEntries = new ArrayList<>(stat.entrySet());
        sortedEntries.sort(Entry.<Character, Integer>comparingByValue().reversed());
        
        for (Entry<Character, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}
}
