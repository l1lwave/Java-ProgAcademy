package lesson4thirdex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FileEquels {
	public boolean isFilesEqual(File fileFirst, File fileSecond) {
		if (fileFirst.length() != fileSecond.length()) {
			return false;
		}

		try (InputStream isFirst = new FileInputStream(fileFirst);
		     InputStream isSecond = new FileInputStream(fileSecond)) {

			byte[] bufferFirst = new byte[4096];
			byte[] bufferSecond = new byte[4096];
			
			int bytesReadFirst, bytesReadSecond;

			while ((bytesReadFirst = isFirst.read(bufferFirst)) != -1 && (bytesReadSecond = isSecond.read(bufferSecond)) != -1) {

				if (bytesReadFirst != bytesReadSecond || 
				    !Arrays.equals(Arrays.copyOf(bufferFirst, bytesReadFirst), Arrays.copyOf(bufferSecond, bytesReadSecond))) {
					return false;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
}
