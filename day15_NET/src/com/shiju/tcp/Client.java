package com.shiju.tcp;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author shiju
 * @date 2021/04/16 18:28
 **/
public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建Socket对象,绑定要连接的主机地址和端口号
        Socket socket = new Socket("127.0.0.1",5678);
        //2.创建输入流,读取要发送的文件信息
        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));

        //3.一次读取一行并写入一行数据
        String s = "";
        while ((s = br.readLine()) != null){
            byte[] bytes = s.getBytes("UTF-8");
            OutputStream os = socket.getOutputStream();
            os.write(bytes,0,bytes.length);
            os.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
            os.flush();
        }
        //4.写入结束标记
        socket.shutdownOutput();
        //5.读取反馈
        BufferedReader br1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //一次读一行
        String line = "";
        while ((line = br1.readLine()) != null){
            System.out.println(line);
        }
        //6.释放资源
        br.close();
        br1.close();
        socket.close();
    }
}
