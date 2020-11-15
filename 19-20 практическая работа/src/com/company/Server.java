
package com.company;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/gleba/IdeaProjects/MireaJava/19-20 практическая работа/src/com/company/history.txt");
        file.delete();
        ArrayList<Integer> ports = new ArrayList<>();
        ArrayList<InetAddress> ipAdress = new ArrayList<>();
        ArrayList<String> names = new ArrayList<String>();
        DatagramSocket socket = new DatagramSocket(9087);
        byte[] buffer = new byte[2048];
        FileWriter writer = new FileWriter(file, true);
        DatagramPacket packet = new DatagramPacket(
                buffer,
                0,
                buffer.length);
        System.out.println("Welcome to the club, body");
        Thread server = new Thread(() -> {
            while (true) {
                DatagramPacket packet1 = null;
                try {
                    socket.receive(packet);
                } catch (IOException e) {
                    e.getMessage();
                }
                String Ip = "IP: " + packet.getAddress();
                System.out.println(Ip);
                try {
                    writer.write(Ip + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String Port = "Port: " + packet.getPort();
                System.out.println("Port: " + packet.getPort());
                try {
                    writer.write(Port + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                int f = 0;
                for (int i = 0; i < ports.size(); i++) {
                    if (ports.get(i) == packet.getPort() && ipAdress.get(i) == packet.getAddress()) {
                        f++;
                    }
                }
                if (f == 0) {
                    ipAdress.add(packet.getAddress());
                    ports.add(packet.getPort());
                    names.add(new String(buffer, 0, packet.getLength()));
                    String greeting = "Server: new user - " + (new String(buffer, 0, packet.getLength()));

                    String date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date());
                    String data = date + " | " + greeting;
                    System.out.println(data + "\n");
                    try {
                        writer.write(data + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < ports.size(); i++) {
                        try {
                            packet1 = new DatagramPacket(data.getBytes(), 0, data.length(), InetAddress.getByName("255.255.255.255"), ports.get(i));
                        } catch (UnknownHostException e) {
                            e.printStackTrace();
                        }
                        try {
                            socket.send(packet1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    for (int i = 0; i < ports.size(); i++) {
                        if (ports.get(i) == packet.getPort() && ipAdress.get(i) == packet.getAddress()) {
                            f = i;
                        }
                    }
                    String message = (new String(buffer, 0, packet.getLength()));
                    String date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date());
                    String data = date + " | " + names.get(f) + ": " + message;
                    System.out.println(data + "\n");
                    try {
                        writer.write(data + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < ports.size(); i++) {
                        try {
                            packet1 = new DatagramPacket(data.getBytes(), 0, data.length(), InetAddress.getByName("255.255.255.255"), ports.get(i));
                        } catch (UnknownHostException e) {
                            e.printStackTrace();
                        }
                        try {
                            socket.send(packet1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                try {
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        server.start();


    }
}