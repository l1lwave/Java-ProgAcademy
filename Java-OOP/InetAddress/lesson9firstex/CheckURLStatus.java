package lesson9firstex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class CheckURLStatus {
	public static Map<String, Boolean> checkUrlStatus(String filePath){
		Map<String, Boolean> urlMap = new HashMap<String, Boolean>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			for (;;) {
		        String textLine = br.readLine();
		        if (textLine == null) {
		          break;
		        }
		        try {
                    URI uri = new URI(textLine);
                    URL url = uri.toURL();
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(10000);
                    connection.setReadTimeout(10000); 
                    try {
                        int responseCode = connection.getResponseCode();
                        if (responseCode == HttpURLConnection.HTTP_OK) {
                            urlMap.put(textLine, true);
                        } else {
                            urlMap.put(textLine, false);
                        }
                    } catch (SocketTimeoutException e) {
                    	// TODO Auto-generated catch block
                        urlMap.put(textLine, false);
                    }
                } catch (Exception e) {
                	// TODO Auto-generated catch block
                    urlMap.put(textLine, false);
                    e.printStackTrace();
                }
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return urlMap;
	}
}
