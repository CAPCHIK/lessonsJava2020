package ru.capchik.ivbo_07_19.lesson10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws IOException {
        sendMessage("Hello from java to 127.0.0.1",
                "127.0.0.1", 9087);
        sendMessage("Hello from java to 25.22.56.68",
                "25.22.56.68", 9087);
        sendMessage("Hello from java to 255.255.255.255",
                "255.255.255.255", 9087);
    }

    public static void sendMessage(
            String message,
            String address,
            int port) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(
                data,
                0, data.length,
                InetAddress.getByName(address),
                port
        );
        socket.send(packet);
        byte[] buffer = new byte[2024];
        DatagramPacket packetToReceive = new DatagramPacket(
                buffer,
                0,
                buffer.length);
        socket.receive(packetToReceive);
        System.out.println(new String(packetToReceive.getData(), 0, packetToReceive.getLength()));
    }
}
