package com.znl.java.net;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Package: com.znl.java.net
 * @ClassName: SocketTest
 * @Author Frank
 * @Data 2021-09-20-21:33
 * @Description:
 * 练习1
 * 1.客户端发送内容给服务端，服务端将内容打印到控制台上。
 */
public class SocketTest {


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
    public void server()  {
        ServerSocket ss = null;
        Socket accept = null;
        try {
            ss = new ServerSocket(9191);

            accept  = ss.accept();

            InputStream inputStream = accept.getInputStream();
            byte[] b = new byte[1024];
            int len;

            while((len = inputStream.read(b)) != -1){
                String str = new String(b,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(ss != null){

                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(accept != null){
                    accept.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
