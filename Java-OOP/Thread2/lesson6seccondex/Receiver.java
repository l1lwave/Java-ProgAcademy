package lesson6seccondex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Receiver implements Runnable {

    private FileService service;
    private File file;

    public Receiver(FileService service, File folderOut, String fileName) throws IOException {
        super();
        this.service = service;
        file = new File(folderOut, fileName);
        file.createNewFile();
    }

    @Override
    public void run() {
        try (OutputStream os = new FileOutputStream(file)) {
            while (!service.isStop()) {
                byte[] bytesArray = service.getBytesArray();
                if (bytesArray != null) {
                    os.write(bytesArray);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
