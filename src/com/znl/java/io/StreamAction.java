package com.znl.java.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamAction {


    /**
     * 复制文件内容到令一个文件
     */
    @Test
    public void copyFileContent(){

        try(FileInputStream in = new FileInputStream("./znl.txt");
            FileOutputStream out = new FileOutputStream("./ZNL/copyZnl.txt")){

            long startTime = System.nanoTime();
            byte[] buffer = new byte[10];
            int b = in.read(buffer);

            while (b != -1){
                System.out.println(b);
                out.write(buffer);
                b = in.read(buffer);
            }
            long endTime = System.nanoTime();
            System.out.println((endTime-startTime)/1000000.0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
