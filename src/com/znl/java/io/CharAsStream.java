package com.znl.java.io;

import org.junit.Test;

import java.io.*;

public class CharAsStream {

    /**
     * 字节流转字符流
     */
    @Test
    public void CharAsStreamTest(){
        try(
                InputStream inputStream = new FileInputStream("./reader.txt");
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
                OutputStream outputStream = new FileOutputStream("./ZNL/znl.txt");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
          ){

            char[] ch = new char[10];
            int result = inputStreamReader.read(ch);

            while (result != -1){
                outputStreamWriter.write(ch);
                result = inputStreamReader.read(ch);
            }

        }catch (Exception ex){

        }
    }
}
