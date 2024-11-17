package lesson6seccondex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Provider implements Runnable {

    private FileService service;
    private File file;
    private int buffer = 100000;
    private long length;
    private long available;
    private ProgressPrinter pp;

    public Provider(FileService service, File file) {
        super();
        this.service = service;
        this.file = file;
        length = file.length();
        available = length;
        pp = new ProgressPrinter();
    }

    private class ProgressPrinter implements Runnable {
        private volatile boolean running = true;

        @Override
        public void run() {
            while (running) {
                int percent = (int) ((length - available) * 100 / length);
                System.out.print("\rProgress: [" + "=".repeat(percent / 2) + " ".repeat(50 - percent / 2) + "] " + percent + "% copied");
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("\rProgress: [==================================================] 100% copied\n");
        }

        public void stop() {
            running = false;
        }
    }

    @Override
    public void run() {
        Thread thr = new Thread(pp);
        thr.start();
        try (InputStream is = new FileInputStream(file)) {
            byte[] bytesArray = new byte[buffer];

            while (available > 0) {
                int bytesRead = is.read(bytesArray, 0, (int) Math.min(buffer, available));
                if (bytesRead == -1) break;
                service.setBytesArray(bytesArray, bytesRead);
                available -= bytesRead;

               
                Thread.sleep(10); 
            }

            service.setStop(true);
            pp.stop();
            thr.join();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
