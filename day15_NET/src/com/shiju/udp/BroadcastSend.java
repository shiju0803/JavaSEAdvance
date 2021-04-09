package com.shiju.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author shiju
 * @date 2021/04/09 15:28
 **/
public class BroadcastSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String s = "hello 广播";
        byte[] bytes = s.getBytes();
        InetAddress id = InetAddress.getByName("255.255.255.255");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,id,port);
        ds.send(dp);
        ds.close();
    }
}
