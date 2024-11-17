package lesson9firstex;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input site url: ");
    String spec = sc.nextLine();
    String code = "UTF-8";
    
    String html = "";
    
    try {
      html = NetworkService.getStringFromURL(spec, code);
    } catch (IOException | URISyntaxException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    URLSaver.saveUrl(html);
    
    Map<String, Boolean> urlMap = CheckURLStatus.checkUrlStatus("Site_urls.txt");
    
    for (Map.Entry<String, Boolean> entry : urlMap.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }

}