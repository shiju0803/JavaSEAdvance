package com.shiju.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author shiju
 * @date 2021/04/16 18:13
 **/
public class ReceiveDemo {
    public static void main(String[] args) throws Exception {
        //创建发送端的数据报对象,绑定发送端端口
        DatagramSocket ds = new DatagramSocket(5501);
        //创建一个字节数组接收数据
        byte[] bytes = new byte[1024];
        //创建数据包接收数据
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //接收数据
        ds.receive(dp);
        //解析数据包
        byte[] b = dp.getData();
        int len = b.length;
        //打印数据
        System.out.println(new String(b,0,len));
    }
}
