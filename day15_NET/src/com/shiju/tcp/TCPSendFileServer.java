package com.shiju.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author shiju
 * @date 2021/04/09 19:15
 **/
public class TCPSendFileServer {
    //服务器:接收文件,写入反馈
    public static void main(String[] args) throws IOException {
        // //tcp特点:建立连接, 形成一个数据传输的通道, 大量数据
        //步骤:
        //1.创建服务端ServerSocket
        ServerSocket socket = new ServerSocket(22722);
        //2.监听客户端连接
        Socket accept = socket.accept();
        //3.得到通道
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        //4.读取数据
        //创建字节输出流,保存数据到文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\client.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.close();
        //写入反馈
        OutputStream os = accept.getOutputStream();
        os.write("文件已上传成功".getBytes(StandardCharsets.UTF_8));
        //关闭Socket
        bis.close();
        os.close();
        accept.close();
        socket.close();
    }
}
