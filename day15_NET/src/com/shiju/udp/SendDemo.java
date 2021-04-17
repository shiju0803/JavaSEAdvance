package com.shiju.udp;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author shiju
 * @date 2021/04/16 18:04
 **/
public class SendDemo {
    public static void main(String[] args) throws Exception {
        //将要发送的字符串转换成字节数组
        byte[] bytes = "黄桂田,点九九三年经常看见jjjjjc1の2678".getBytes("UTF-8");
        //创建数据报
        DatagramSocket ds = new DatagramSocket();
        //创建数据报包
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("127.0.0.1"), 5501);
        //发送数据包
        ds.send(dp);
    }
}
