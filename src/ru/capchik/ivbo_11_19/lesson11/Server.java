package ru.capchik.ivbo_11_19.lesson11;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10101);
        byte[] buffer = new byte[2048];
        DatagramPacket packet = new DatagramPacket(
                buffer,
                0,
                buffer.length
        );
        System.out.println("Listen on 10101...");
        while (true) {
            socket.receive(packet);
            System.out.println(
                    packet.getAddress() + ": " + packet.getPort());
            String message = new String(buffer, 0, packet.getLength());
            System.out.println(message);

            String responseMessage = "Received: " + message;
            byte[] responseData = responseMessage.getBytes();
            DatagramPacket responsePacket = new DatagramPacket(
                    responseData,
                    0, responseData.length,
                    packet.getAddress(),
                    packet.getPort()
            );
            socket.send(responsePacket);
        }
    }
}
