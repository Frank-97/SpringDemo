package com.znl.java.io;

import org.junit.Test;

import java.io.*;

public class BufferStreamAction {


    @Test
    public void bufferStreamTest(){

        try(FileInputStream in = new FileInputStream("./znl.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
            FileOutputStream out = new FileOutputStream("./ZNL/copyZnl.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
            ){
            long startTime = System.nanoTime();
            byte[] b = new byte[10];
            int re = bufferedInputStream.read(b);
            while (re != -1){
                bufferedOutputStream.write(b,0,re);
                re = bufferedInputStream.read(b);
            }
            long endTime = System.nanoTime();
            System.out.println((endTime-startTime)/1000000.0);
        }catch (IOException ex){

        }
    }
}
