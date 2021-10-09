package com.znl.java.net;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Package: com.znl.java.net
 * @ClassName: URLTest
 * @Author Frank
 * @Data 2021-09-21-20:35
 * @Description:
 *
 * 测试URL
 *
 * URL的组成部分：
 *   传输协议://域名：端口号//文件名#片段名?参数列表
 */
public class URLTest {



    @Test
    public void testURLSplit(){

        try {
            URL url = new URL("http://bpic.588ku.com/element_origin_min_pic/16/10/29/2ac8e99273bc079e40a8dc079ca11b1f.jpg");
            //获取主机名
            System.out.println(url.getHost());
            //获取端口好
            System.out.println(url.getPort());
            //获取路径名
            System.out.println(url.getPath());
            //获取文件名
            System.out.println(url.getFile());
            //获取协议
            System.out.println(url.getProtocol());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testURL() throws Exception {

        //1、创建URL实例
        URL url = new URL("http://bpic.588ku.com/element_origin_min_pic/16/10/29/2ac8e99273bc079e40a8dc079ca11b1f.jpg");

        //2、读取数据以流的方式
        InputStream is = url.openStream();
        //3、写入到本地文件中
        OutputStream os = new FileOutputStream("zqj.jpg");

        byte[] b = new byte[1024];
        int len;

        while((len = is.read(b)) != -1){
            os.write(b,0,len);
        }

        is.close();
        os.close();
    }


    @Test
    public void testURLConnection() throws Exception{
        //URLConnection类：例如果需要想服务器的CGI(公共网关接口-common-gateway-interface)发送一些数据
        //这时候就需要使用到这个类

        URL url = new URL("http://bpic.588ku.com/element_origin_min_pic/16/10/29/2ac8e99273bc079e40a8dc079ca11b1f.jpg");
        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();

        //3、写入到本地文件中
        OutputStream os = new FileOutputStream("zqj1.jpg");

        byte[] b = new byte[1024];
        int len;

        while((len = is.read(b)) != -1){
            os.write(b,0,len);
        }

        is.close();
        os.close();
    }
}
