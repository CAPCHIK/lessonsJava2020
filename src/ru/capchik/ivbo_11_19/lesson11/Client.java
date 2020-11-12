package ru.capchik.ivbo_11_19.lesson11;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        sendMessage("Hello from vsdrvsr vsr ", "127.0.0.1", 10101);
    }

    private static void sendMessage(String message, String address, int port)
            throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(
                data,
                0,
                data.length,
                InetAddress.getByName(address),
                port
        );
        socket.send(packet);
        byte[] buffer = new byte[2048];
        DatagramPacket responsePacket = new DatagramPacket(
                buffer,
                0,
                buffer.length
        );
        socket.receive(responsePacket);
        System.out.println(new String(buffer, 0, responsePacket.getLength()));
    }
}
