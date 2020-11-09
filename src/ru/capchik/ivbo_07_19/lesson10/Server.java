package ru.capchik.ivbo_07_19.lesson10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9087);
        byte[] buffer = new byte[2024];
        DatagramPacket packet = new DatagramPacket(
                buffer,
                0,
                buffer.length);
        System.out.println("listening on 9087");
        while (true) {
            socket.receive(packet);
            System.out.println(packet.getAddress());
            System.out.println(packet.getPort());
            String message = new String(buffer, 0, packet.getLength());
            System.out.println(message);

            byte[] data = ("echo " + message).getBytes();
            DatagramPacket packetToSend = new DatagramPacket(
                    data,
                    0, data.length,
                    packet.getAddress(),
                    packet.getPort()
            );
            socket.send(packetToSend);
        }
    }
}
