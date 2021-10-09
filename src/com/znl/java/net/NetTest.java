package com.znl.java.net;

import org.junit.Test;

import java.io.*;
import java.net.URL;

/**
 * 面向网络编程
 *
 *
 *
 *
 */
public class NetTest {

    @Test
    public void netCore(){
        String urlString = "https://www.sina.com.cn/";
        try {
            URL url = new URL(urlString);
            //字节流
            InputStream inputStream = url.openStream();
            //字节转字符流
            InputStreamReader reader = new InputStreamReader(inputStream,"UTF-8");
            //缓冲字符流
            BufferedReader bufferedReader = new BufferedReader(reader);
            FileOutputStream out = new FileOutputStream("./ZNL/znl.txt");
            OutputStreamWriter writer = new OutputStreamWriter(out);
            char[] ch = new char[100];
            int re = bufferedReader.read(ch);
            while (re != -1){
                writer.write(ch);
                re = bufferedReader.read(ch);
            }
//            StringBuilder builder = new StringBuilder(200);
//            String s = bufferedReader.readLine();

        }catch(Exception ex){

        }
    }
}
