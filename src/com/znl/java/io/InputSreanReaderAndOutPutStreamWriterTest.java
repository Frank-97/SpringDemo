package com.znl.java.io;

import org.junit.Test;

import java.io.*;

/**
 * @Package: com.znl.java.io
 * @ClassName: InputSreanReaderAndOutPutStreamWriterTest
 * @Author Frank
 * @Data 2021-09-15-21:58
 * @Description:
 */
public class InputSreanReaderAndOutPutStreamWriterTest {


    @Test
    public void test1() throws IOException {

        FileInputStream fis = new FileInputStream("hello.txt");
        FileOutputStream fos = new FileOutputStream("hello1.txt");

        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

        char[] ch = new char[20];
        int len;
        while((len = isr.read(ch)) != -1){
            osw.write(ch,0,len);
        }

        isr.close();
        osw.close();

    }



}
