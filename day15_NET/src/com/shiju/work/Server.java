package com.shiju.work;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //发送消息
                    send();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //接收消息
                    receive();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    //读取键盘录入,发送消息
    public static void send() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            byte[] bytes = s.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, Inet4Address.getByName("127.0.0.1"), 10001);
            socket.send(packet);
        }
    }
    //接收消息
    public static void receive() throws IOException {
        DatagramSocket socket = new DatagramSocket(10002);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        while (true) {
            socket.receive(packet);
            String msg = new String(packet.getData(),0,packet.getLength());
            System.out.println(msg);
        }
    }

}
