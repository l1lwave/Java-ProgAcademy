package lesson6thirdex;

import java.io.File;
import java.util.List;

public class Search implements Runnable {

    private File file;
    private String name;
    private List<File> found;
    private static final int MAX_THREADS = 10;

    public Search(File file, String name, List<File> found) {
        this.file = file;
        this.name = name;
        this.found = found;
    }

    @Override
    public void run() {
        searchFile(file);
    }
    
    public synchronized void searchFile(File file) {
    	if (file.isDirectory()) {
	    	File[] files = file.listFiles();
	        if (files != null) {
	            Thread[] threads = new Thread[MAX_THREADS];
	            int threadIndex = 0;
	
	            for (int i = 0; i < files.length; i++) {
	                if (threadIndex >= MAX_THREADS) {
	                    for (int j = 0; j < MAX_THREADS; j++) {
	                        try {
	                            threads[j].join();
	                        } catch (InterruptedException e) {
	                            e.printStackTrace();
	                        }
	                    }
	                    threadIndex = 0;
	                }
	
	                threads[threadIndex] = new Thread(new Search(files[i], name, found));
	                threads[threadIndex].start();
	                threadIndex++;
	            }
	
	            for (int i = 0; i < threadIndex; i++) {
	                try {
	                    threads[i].join();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
    	} else if (file.getName().equals(name)) {
    		found.add(file);
        }
    }
}
