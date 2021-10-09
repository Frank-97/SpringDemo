package com.znl.java.collectionz;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Package: com.znl.java.collectionz
 * @ClassName: ArrayListTest
 * @Author Frank
 * @Data 2021-08-11-21:24
 * @Description:
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("123");
        Object o = list.get(0);
        System.out.println(o);
        Object obj1 = list.get(0);
        for (Object obj:
        list) {
            System.out.println(obj);
        }
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
