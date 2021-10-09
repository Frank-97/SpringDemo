package com.znl.java.io;

import org.junit.Test;

import java.io.*;

/**
 * @Package: com.znl.java.io
 * @ClassName: SystemInAndSystemOutTest
 * @Author Frank
 * @Data 2021-09-15-22:31
 * @Description:
 */
public class SystemInAndSystemOutTest {


    @Test
    public void test() throws IOException {


    }


    public static void main(String[] args)  {

        BufferedReader br = null;
        try {
            System.out.println("请输入字符串! \n");
            br = new BufferedReader(new InputStreamReader(System.in));
            String str = null;
            while ((str = br.readLine()) != null){
                if("e".equalsIgnoreCase(str) || "exit".equalsIgnoreCase(str)){
                    System.out.println("程序结束");
                    break;
                }
                System.out.println(str.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
