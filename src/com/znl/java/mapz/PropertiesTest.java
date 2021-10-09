package com.znl.java.mapz;

import org.junit.Test;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @Package: com.znl.java.mapz
 * @ClassName: PropertiesTest
 * @Author Frank
 * @Data 2021-09-05-15:22
 * @Description:
 */
public class PropertiesTest {

    @Test
    public void test1() throws Exception{

        Properties p = new Properties();
        p.load(new FileInputStream("jdbc.properties"));
        String name = p.getProperty("name");
        System.out.println(name);
    }
}
