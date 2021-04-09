package com.shiju.tcp;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author shiju
 * @date 2021/04/09 16:15
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        Socket s = new Socket("localhost", 22722);
        //创建流套接字并将其连接到指定主机上的指定端口号
        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));

        String str = "";
        while ((str = br.readLine()) != null) {
            byte[] bytes = str.getBytes();
            OutputStream os = s.getOutputStream();
            os.write(bytes, 0, bytes.length);
            os.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
            os.flush();
        }
        //写入结束标记
        s.shutdownOutput();

        //读取反馈
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //一次读一行
        String line;
        while ((line = br1.readLine()) != null) {
            System.out.println(line);
        }
        //释放资源
        br.close();
        s.close();
    }
}
