package com.shiju.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * UDP协议发送信息
 *
 * @author shiju
 * @date 2021/04/09 11:52
 **/
public class Send {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //创建数据报Socket(本地ip + 空闲端口)
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            String s = "1:100:黄桂田:嘤嘤怪:32:" + sc.nextLine();
            //输入的数据是886，发送数据结束
            if ("1:100:黄桂田:嘤嘤怪:32:886".equals(s)) {
                break;
            }
            //创建数据报包
            byte[] bytes = s.getBytes("GBK");
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.81.145"), 2425);
            //有数据报发送数据
            ds.send(dp);
        }
       ds.close();
    }
}
