package com.shiju.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP协议接收信息
 * @author shiju
 * @date 2021/04/09 14:01
 **/
public class Receive {
    public static void main(String[] args) throws IOException {
        // 创建发送端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(5500);
        //创建一个数据包，用于接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);
        //解析数据包，并把数据在控制台显示
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println("黄狗狗发来:" + new String(data,0,length));
        //关闭接收端
        ds.close();
    }
}
