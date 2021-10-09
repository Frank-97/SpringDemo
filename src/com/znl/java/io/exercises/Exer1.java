package com.znl.java.io.exercises;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Package: com.znl.java.io.exercises
 * @ClassName: Exer1
 * @Author Frank
 * @Data 2021-09-10-22:44
 * @Description:
 *
 *1. 利用File构造器，new 一个文件目录file
     * 1)在其中创建多个文件和目录
     * 2)编写方法，实现删除file中指定文件的操作
 * 2. 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
 * 3. 遍历指定目录所有文件名称，包括子文件目录中的文件。
     * 拓展1：并计算指定目录占用空间的大小
     * 拓展2：删除指定文件目录及其下的所有文件
 *
 */
public class Exer1 {


    @Test
    public void test1() throws IOException {
        File file = new File("Exer");
        boolean mkdir = file.mkdir();


        File f1 = new File(file,"Exer1");
        f1.mkdir();
        File f2 = new File(file,"Exer2");
        f2.mkdir();
        File f3 = new File(file,"exer3.txt");
        f3.createNewFile();

        delFile(f3);


    }


    public Boolean delFile(File file){
        return file.delete();
    }

}
