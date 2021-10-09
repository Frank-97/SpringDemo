package com.swj.test.exceptionz;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;

public class ExcetptionTest {


   @Test
    public void getSubResult() {
       try(BufferedReader br = new BufferedReader(new FileReader(
               "C:\\znl.txt"));
           java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(FileSystems.getDefault().getPath("C:\\journaldev.txt"), Charset.defaultCharset())){
         double result = this.getResult(1,2);
           System.out.println(result);
       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }
    }

    public double getResult(double i, double j) throws ArithmeticException {
        return i / j;
    }
}
