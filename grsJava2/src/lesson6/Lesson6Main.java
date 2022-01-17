package lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Lesson6Main {
    static private ServerSocket server;
    private static Socket socket;

    static private final int SERVER_PORT = 8189;
//    private static final String SERVER_ADR = "localhost";
//    static private int client_port;
    private static Scanner sc;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(SERVER_PORT);
            System.out.println("Server started...");
            socket = server.accept();
            System.out.println("Client connected...");
            sc = new Scanner(socket.getInputStream());

            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());


            Thread treadReader = new Thread(() -> {
                while (true) {
                    try {
                        outputStream.writeUTF(sc.nextLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            treadReader.setDaemon(true);
            treadReader.start();

            while (true){
                String str = inputStream.readUTF();
                if (str.equals("/end")){
                    System.out.println("Client disconnected...");
                    outputStream.writeUTF("/end");
                    break;
                }
                else System.out.println("Client: " + str);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}

