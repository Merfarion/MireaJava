package com.company;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


public class Client {
    public static Scanner scanner = new Scanner(System.in);

    public static void getMessage(DatagramSocket socket) throws IOException {

        String nick = scanner.nextLine();
        while (true) {
            String message = scanner.nextLine();
            DatagramPacket packet;
            byte[] sendBuffer = (nick + ": " + message).getBytes();
            try {
                packet = new DatagramPacket(sendBuffer, 0, sendBuffer.length, InetAddress.getByName("127.0.0.1"), 9087);
                socket.send(packet);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public static void sendMessage(DatagramSocket socket) throws IOException {
        while (true) {
            byte[] buffer = new byte[2024];
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
            String message;
            try {
                socket.receive(packet);
                message = new String(packet.getData(), 0, packet.getLength());
                System.out.println(message);
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        try {
            int port = scanner.nextInt();
            DatagramSocket socket = new DatagramSocket(port);
            System.out.println("Enter your nickname");
            Thread thread = new Thread(() -> {
                try {
                    getMessage(socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            thread.start();
            thread = new Thread(() -> {
                try {
                    sendMessage(socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        } catch (IOException e) {

        }

    }
}

