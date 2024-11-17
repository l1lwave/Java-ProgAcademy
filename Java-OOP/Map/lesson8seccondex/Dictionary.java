package lesson8seccondex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Dictionary {
	private Map<String, String> dictionary = new HashMap<>();

	public Dictionary(Map<String, String> dictionary) {
		super();
		this.dictionary = dictionary;
	}
	
	public Dictionary() {
		super();
	}

	public Map<String, String> getDictionary() {
		return dictionary;
	}

	public void setDictionary(Map<String, String> dictionary) {
		this.dictionary = dictionary;
	}
	
	public void addWord(String word, String translation) {
		dictionary.put(word, translation);
	}
	
	public void deleteWord(String word) {
		dictionary.remove(word);
	}
	
	public String findTranslation(String word) {
		String translation = null;
		if(dictionary.containsKey(word)) {
			translation = dictionary.get(word);
		}
		return translation;
	}

	public void saveDictionary(String filePath) {
		String f = filePath + ".csv";
		File file = new File(f);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.append("Word,Translate\n");
			for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.append(entry.getKey()).append(",").append(entry.getValue()).append("\n");
            }
            System.out.println("Saving to csv complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public Map<String, String> loadFromCSV(String filePath){
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",", -1);
                if (fields.length >= 2) { 
                    String key = fields[0];
                    String value = fields[1];
                    dictionary.put(key, value);
                }
            }
            System.out.println("Loading from csv complete");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return dictionary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append("Dictionary:\n");
	    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
	        sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
	    }
	    return sb.toString();
	}
}
