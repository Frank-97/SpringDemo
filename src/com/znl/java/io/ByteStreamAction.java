package com.znl.java.io;

import org.junit.Test;

import java.io.*;

public class ByteStreamAction {


    @Test
    public void byteStreamTest() throws IOException {
        try (Reader reader = new FileReader("./reader.txt");
             Writer writer = new FileWriter("./ZNL/writer.txt");) {

            char[] ch = new char[10];
            int re = reader.read(ch);
            while (re != -1) {
                System.out.println(ch[1]);
                writer.write(ch);
                re = reader.read(ch);
            }
        }
    }


    @Test
    public void bufferStreamTest() throws IOException {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;

        try {
            reader = new FileReader("./reader.txt");
            bufferedReader = new BufferedReader(reader);
            writer = new FileWriter("./ZNL/writer.txt");
            bufferedWriter = new BufferedWriter(writer);

            char[] ch = new char[20];
            int result = bufferedReader.read(ch);
            while (result != -1) {
                bufferedWriter.write(ch);
                result = bufferedReader.read(ch);
            }
        } catch (Exception exception) {

        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            if(writer != null){
                writer.close();
            }
            if(bufferedReader != null){
                bufferedReader.close();
            }
            if(reader != null){
                reader.close();
            }
        }
    }

}
