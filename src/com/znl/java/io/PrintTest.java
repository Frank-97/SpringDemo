package com.znl.java.io;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Package: com.znl.java.io
 * @ClassName: PrintTest
 * @Author Frank
 * @Data 2021-09-15-23:32
 * @Description:
 */
public class PrintTest {


    @Test
    public void test()  {

        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream("hello.txt");

            ps = new PrintStream(fos,true);

            if(ps != null){
                System.setOut(ps);
            }

            for (int i = 0;i<=250;i++){

                System.out.print((char)i);
                if(i%50 == 0){
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            ps.close();
        }


    }
}
