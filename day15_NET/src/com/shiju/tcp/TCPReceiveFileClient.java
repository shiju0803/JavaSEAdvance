package com.shiju.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @author shiju
 * @date 2021/04/09 19:16
 **/
public class TCPReceiveFileClient {
    /**
      客户端,发送文件,接收反馈
     */
    public static void main(String[] args) throws IOException {
        /**
         * tcp发送数据
         *  tcp特点:建立连接, 形成一个数据传输的通道, 大量数据
         */

         /**
          * 步骤:
          *  1.创建客户端Socket(目标IP,目标端口)
          */
        Socket client = new Socket("127.0.0.1",22722 );
        //2.得到通道(字节流)
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        //创建输入流,读取本地文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            //3.写入数据
            bos.write(bytes,0,len);
            bos.flush();
        }
        //关闭本地的流
        bis.close();
        //告诉服务器,写入结束标记,后续socket可以继续使用
        client.shutdownOutput();

        //读取服务器的反馈
        InputStream is = client.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //4.关闭socket
        //os.close();
        client.close();//会自动关闭关联的通道
    }
}
