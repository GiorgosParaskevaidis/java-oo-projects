package gr.aueb.cf.fileServer;

import java.io.*;
import java.net.Socket;

public class ConcurrentFileServer implements Runnable {
    private final Socket sockFd;

    public ConcurrentFileServer(Socket sockFd) {
        this.sockFd = sockFd;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(sockFd.getOutputStream()));
             BufferedReader reader = new BufferedReader(new InputStreamReader(sockFd.getInputStream()))) {

            String filePath = reader.readLine();
            System.out.println("Client requested file: " + filePath);

            File file = new File(filePath);

            if (file.exists() && file.isFile()) {
                try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = fileReader.readLine()) != null) {
                        writer.write(line);
                    }
                }
            } else {
                writer.write("File not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
