package com.shiju.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * 组播接收
 * @author shiju
 * @date 2021/04/09 15:26
 **/
public class MulticastReceive {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10000);
        // 2. 创建一个数据包，用于接收数据
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        // 3. 调用DatagramSocket对象的方法接收数据
        //添加接收socket到组
        ms.joinGroup(InetAddress.getByName("225.0.0.0"));
        ms.receive(dp);
        // 4. 解析数据包，并把数据在控制台显示
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(data,0,length));
        // 5. 关闭接收端
        ms.close();
    }
}
