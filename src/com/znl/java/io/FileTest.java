package com.znl.java.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @Package: com.znl.java.io
 * @ClassName: FileTest
 * @Author Frank
 * @Data 2021-09-09-22:38
 * @Description:
 *
 * File类API测试
 *
 */
public class FileTest {


    //获取功能
    @Test
    public void test1() throws IOException {
        File file = new File("hello.txt");
        boolean newFile = file.createNewFile();
        if(newFile){
            System.out.println("创建成功");
        }

        System.out.println("文件绝对路径："+file.getAbsoluteFile());
        System.out.println("文件相对路径："+file.getPath());
        System.out.println("文件名称："+file.getName());
        System.out.println("文件长度："+file.length());
        System.out.println("文件最后修改时间："+new Date(file.lastModified()));
        System.out.println("获取上层目录："+file.getParent());

        File file1 = new File("D:\\IdeaProject");

        //获取指定路径下的所有文件或目录的名称数组
        String[] list = file1.list();
        for (String str:list) {
            System.out.println("FileName:"+str);
        }

        File[] files = file1.listFiles();
        for(File file2 : files){
            System.out.println("File:"+file2.getName());
        }
    }


    @Test
    public void test2() throws IOException {

        File file = new File("D:\\IdeaProject\\ZNL","child.txt");


        boolean delete = file.delete();
        if(delete){
            System.out.println("删除成功");
        }


        File file1 = new File(new File("D:\\IdeaProject\\ZNL"),"file.txt");

        boolean mkdir = file1.mkdir();
        if(mkdir){
            System.out.println("创建成功");
        }

    }


    @Test
    public void test3(){

        File file = new File("D:\\IdeaProject\\ZNL\\HTML");

        //如果文件或文件目录不存在就创建
        if (!file.exists()){
            file.mkdir();
            System.out.println("创建成功");
        }

        System.out.println("是否是文件目录："+file.isDirectory());

        System.out.println("是否是文件："+file.isFile());

        System.out.println("是否可读："+file.canRead());

        System.out.println("是否可写："+file.canWrite());

        System.out.println("是否隐藏："+file.isHidden());
    }



}
