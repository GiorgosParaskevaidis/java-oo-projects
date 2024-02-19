package gr.aueb.cf.fileServer;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConcurrentFileServerClient {
    public static final int port = 13;

    public static void main(String[] args) throws UnknownHostException {
        InetAddress servAddress = InetAddress.getByName("127.0.0.1");

        try (Socket socket = new Socket(servAddress, port);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)
        ) {
            String filePath = "C:/Users/litsa/tests/test.txt";

            if (fileExists(filePath)) {
                System.out.println("Server: " + filePath + " exist");
            } else {
                System.out.println("File not found: " + filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean fileExists(String filePath) {
        Path path = Paths.get(filePath);
        return Files.exists(path) && !Files.isDirectory(path);
    }

}
