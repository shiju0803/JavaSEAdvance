package com.shiju.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author shiju
 * @date 2021/04/09 15:28
 **/
public class BroadcastReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);

        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);

        while (true){
            ds.receive(dp);
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println("服务器:" + s);
            System.out.println("发送者IP:" + dp.getAddress());
            System.out.println("发送者端口:" + dp.getPort());
        }
        //ds.close();
    }
}
