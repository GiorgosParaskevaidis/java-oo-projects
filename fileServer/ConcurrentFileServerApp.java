package gr.aueb.cf.fileServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ConcurrentFileServerApp {
    public static final int port = 13;

    public static void main(String[] args) {
        try (var serverFd = new ServerSocket();) {
            serverFd.bind(new InetSocketAddress("127.0.0.1", port));
            System.out.println("Server Started...");

            while (true) {
                Socket connectedFd = serverFd.accept();
                Thread socketThread = new Thread(new ConcurrentFileServer(connectedFd));
                socketThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
