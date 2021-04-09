package com.shiju.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author shiju
 * @date 2021/04/09 16:20
 **/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        ServerSocket ss = new ServerSocket(22722);
        //等待客户端连接
        Socket accept = ss.accept();
        //获得输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String s = "";
        while ((s = br.readLine()) != null) {
            System.out.print(s + System.lineSeparator());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("我收到了");
        bw.flush();
        //释放资源
        br.close();
        bw.close();
        ss.close();
    }
}
