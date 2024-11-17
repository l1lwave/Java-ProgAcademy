package lesson4firstex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileService {
  public static long copyFile(File fileIn, File fileOut) throws IOException {
    try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut)) {
      return is.transferTo(os);
    }
  }

  public static long copyFiles(File folderIn, File folderOut, String extension) throws IOException {
	 long count = 0;
	 File[] filelist = folderIn.listFiles();
	    
	 if (filelist == null) {
	   return 0;
	 }

	 for (int i = 0; i < filelist.length; i++) {
	   if (filelist[i].isFile() && filelist[i].getName().endsWith(extension)) {
	     copyFile(filelist[i], new File(folderOut, filelist[i].getName()));
	     count += 1;
	   }
	 }
	 return count;
  }
}
