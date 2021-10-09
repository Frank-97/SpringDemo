package com.znl.java.vessel;

import org.junit.Test;

import java.util.*;

public class ArrayListTest {


    @Test
    public void  ArrayListOpration(){
        List arrayList = new ArrayList();
        arrayList.add("2");
        arrayList.add(1);
        arrayList.add( new StudentClass());

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(arrayList.size());


        List<String> linkedList = new LinkedList();
        linkedList.add("123");
        linkedList.add("123");
        linkedList.add("456");



        Set set = new HashSet<>();
        set.add(1);

        Map<String,Object> map = new HashMap<>();
        map.put("k1","123");
        map.put("k2","123");
        String k1 = map.get("k1").toString();

        Map<String,Object> hashTable = new Hashtable<>();

    }


    class StudentClass{
        String name;
        String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "StudentClass{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }
}
