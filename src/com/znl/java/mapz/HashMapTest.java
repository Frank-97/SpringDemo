package com.znl.java.mapz;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Package: com.znl.java.mapz
 * @ClassName: HashMapTest
 * @Author Frank
 * @Data 2021-09-04-20:33
 * @Description: HashMap的API使用
 * 增　ｐｕｔ（），ｐｕｔＡｌｌ（）
 * 删　ｒｅｍｏｖｅ（）
 * 改　ｐｕｔ（）
 * 查　　ｇｅｔ（），ｅｎｔｒｙＳｅｔ（）
 * 视图：ｋｅｙＳｅｔ（），ｖａｌｕｅｓ（），ｅｎｔｒｙＳｅｔ（）
 * 是否为空：ｉｓＥｎｐｔｙ（）
 * 是否包含：ｃｏｎｔａｉｎｓＫｅｙ（），ｃｏｎｔａｉｎｓＶａｌｕｅｓ（）
 * 克隆：ｃｌｏｎｅ（）
 * 替换：ｒｅｐｌａｓｅ（）
 */
public class HashMapTest {


    @Test
    public void viewTest(){

        HashMap hashMap = new HashMap();
        hashMap.put(null,null);
        hashMap.put("v1", "123");
        hashMap.put("v2", "234");
        hashMap.put("v3", "234");
        hashMap.put("v4", "234");
        hashMap.put("v5", "234");

        Set set = hashMap.keySet();

        System.out.println("keys : "+set);
        Collection values = hashMap.values();

        System.out.println("values : "+values);
        Set set1 = hashMap.entrySet();
        System.out.println("key-values : "+set1);



    }


    @Test
    public void test1() {

        HashMap map = new HashMap();
        map.put("v1", "123");
        map.put("v2", "234");
        map.put("v3", "234");
        map.put("123", "234");
        map.put("234", "234");
        map.put(null, "12");

        System.out.println("v1 = " + map.get("v1"));
        System.out.println("null = " + map.get(null));

        Map map1 = new HashMap();
        map1.put("v4", "234");
        map.putAll(map1);
        System.out.println(map);

        map.remove("v4");
        System.out.println(map);

        Set set = map.entrySet();
        System.out.println(set);

        System.out.println("是否为空："+map.isEmpty());

        System.out.println("是否包含指定key: "+map.containsKey("v1"));

        System.out.println("是否包含指定value: "+map.containsValue("123"));


        Map clone = (Map)map.clone();
        System.out.println(clone);

        map.replace("v1","123123123");
        System.out.println(map);


    }
}
