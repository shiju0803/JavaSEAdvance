package com.shiju.tcp;

import java.io.*;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * @author shiju
 * @date 2021/04/16 18:28
 **/
public class Server {
    public static void main(String[] args) throws Exception {
        //创建Socket对象,并绑定端口号
        ServerSocket socket = new ServerSocket(5678);
        //等待客户端连接
        Socket accept = socket.accept();
        //获取输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String s ="";
        while ((s = br.readLine()) != null){
            System.out.println(s + System.lineSeparator());
        }
        //创建输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("我收到了");
        bw.flush();

        //释放资源
        br.close();
        bw.close();
        socket.close();
    }
}
