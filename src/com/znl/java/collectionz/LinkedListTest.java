package com.znl.java.collectionz;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Package: com.znl.java.collectionz
 * @ClassName: LinkedListTest
 * @Author Frank
 * @Data 2021-08-11-21:09
 * @Description:
 * linkedList测试
 *
 *
 *
 *
 *
 */
public class LinkedListTest {


    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("123");
        link.add("456");

        link.add(1,"789");

        Iterator<String> iterator = link.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }


    }
}
