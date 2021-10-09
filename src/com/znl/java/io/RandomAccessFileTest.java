package com.znl.java.io;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Package: com.znl.java.io
 * @ClassName: RandomAccessFileTest
 * @Author Frank
 * @Data 2021-09-20-14:58
 * @Description:
 *
 * 测试RandomAccessFile
 *   实现了DataInput&DataOutPut意味着这个类既可以读，又可以写
 *
 */
public class RandomAccessFileTest {



    @Test
    public void test(){

        RandomAccessFile far = null;
        RandomAccessFile faw = null;

        try {
             far = new RandomAccessFile("hello.txt","r");
             faw = new RandomAccessFile("helloRandom.txt","rw");
            byte[] b = new byte[1024];
            int len;

            while((len = far.read(b))!=-1){
                faw.write(b,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            if(far != null){
                try {
                    far.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            if(faw != null){
                try {
                    faw.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }

        }
    }

    @Test
    public void test2() throws IOException{

        RandomAccessFile far = new RandomAccessFile("hello1.txt","rw");

        far.seek(6); //将指针移动到指定位置
        byte[] b = new byte[1024];
        int len;
        while((len = far.read(b)) != -1){
            String str =  new String(b,0,len);
            System.out.println(str);
        }

    }

}
