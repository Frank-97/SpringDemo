package com.znl.java.io.exercises;

import org.junit.Test;

import java.io.*;

/**
 * @Package: com.znl.java.io.exercises
 * @ClassName: Exer2
 * @Author Frank
 * @Data 2021-09-12-23:27
 * @Description:
 *
 * 节点流测试：
 *    FileWrite:
 *
 *    FileReader:
 *
 *
 */
public class Exer2 {


    @Test
    public void test1()  {

        FileWriter fw = null;
        try {
            File file = new File("hello.txt");

            fw = new FileWriter(file);
            fw.write("hello ");
            fw.write("world! ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2()  {

        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);
            int len ;
            while ((len = fr.read()) != -1){
                System.out.print((char) len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流操作 JVM不能回收物理连接
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
