package com.znl.java.net;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Package: com.znl.java.net
 * @ClassName: SocketTest1
 * @Author Frank
 * @Data 2021-09-20-21:50
 * @Description:
 * 练习2
 * 2.客户端发送文件给服务端，服务端将文件保存在本地。
 *3.从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给
 * 客户端。并关闭相应的连接。
 */
public class SocketTest1 {


    @Test
    public void client()  {

        Socket socket = null;
        InputStream in = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(),9191);

            OutputStream outputStream = socket.getOutputStream();

            in = new FileInputStream("hello1.txt");
            byte[] b = new byte[1024];
            int len;

            while ((len = in.read(b)) != -1){
                outputStream.write(b);
            }

            //关闭数据的输出
            socket.shutdownOutput();

            InputStream inputStream = socket.getInputStream();
            byte[] b1 = new byte[1024];
            int len1;
            while ((len1 = inputStream.read(b1)) != -1){
                String str = new String(b1,0,len1);
                System.out.println(str);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    @Test
    public void server() {
        ServerSocket ss = null;
        Socket accept = null;
        try {
            ss = new ServerSocket(9191);

            accept = ss.accept();

            InputStream inputStream = accept.getInputStream();
            byte[] b = new byte[1024];
            int len;

            OutputStream os = new FileOutputStream(new File("server.txt"));
            while ((len = inputStream.read(b)) != -1) {
                os.write(b,0,len);
            }

            OutputStream inputStream1 = accept.getOutputStream();
            inputStream1.write("发送成功".getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ss != null) {
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (accept != null) {
                    accept.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
