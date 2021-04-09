package com.shiju.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 组播发送
 * @author shiju
 * @date 2021/04/09 15:26
 **/
public class MulticastSend {
    public static void main(String[] args) throws IOException {
        // 1. 创建发送端Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();
        // 2. 创建存储数据的箱子,将广播地址封装进去
        String s = "组播 hello";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("225.0.0.0");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        // 3. 发送数据
        ds.send(dp);
        // 4. 释放资源
        ds.close();
    }
}
