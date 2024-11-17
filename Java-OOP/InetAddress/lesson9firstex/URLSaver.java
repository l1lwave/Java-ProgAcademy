package lesson9firstex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class URLSaver {
	public static void saveUrl(String html) {
		List<String> urls = new ArrayList<>();
		int i = 0;
		
		while((i = html.indexOf("href=\"", i)) != -1) {
			int start = i + 6;
			int end = html.indexOf("\"", start);
			if (end != -1) {
				urls.add(html.substring(start, end));
			}
			i = end;
		}
				
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("Site_urls.txt"))) {
			for (String url : urls) {
				if (url.startsWith("http://") || url.startsWith("https://")) {
					writer.write(url);
					writer.newLine();
				}
			}
			System.out.println("All links was saved to file \"Site_urls.txt\".");
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
