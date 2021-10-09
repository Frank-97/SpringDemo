package com.znl.java.net;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * @Package: com.znl.java.net
 * @ClassName: DatagramTest
 * @Author Frank
 * @Data 2021-09-21-15:32
 * @Description:
 *
 * UDP网络编程测试
 *
 */
public class DatagramTest {


    @Test
    public void client() {

        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();

            byte[] b= "数据发送包".getBytes();
            DatagramPacket dp = new DatagramPacket(b,0,b.length, InetAddress.getByName("127.0.0.1"),9999);

            ds.send(dp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ds != null){
                ds.close();
            }
        }

    }


    @Test
    public void server() {

        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9999);

            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b,0,b.length);

            ds.receive(dp);


            String str = new String(dp.getData(),0,b.length);

            System.out.println(str+"--"+dp.getAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ds.close();
        }


    }

}
