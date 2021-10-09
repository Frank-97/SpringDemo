package com.znl.java.clazz;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Package: com.znl.java.clazz
 * @ClassName: ClazzTest
 * @Author Frank
 * @Data 2021-09-21-21:29
 * @Description:
 */
public class ClazzTest {


    @Test
    public void test1() throws ClassNotFoundException {
        Person p = new Person("张三",12);
        System.out.println(p.getAge());
        System.out.println(p.getName());


        Class c1 = Person.class;
        Class c2 = p.getClass();
        Class c3 = Class.forName("com.znl.java.clazz.Person");
    }



    @Test
    public void test() throws Exception {
        //Class是所有类的抽象类，万事万物皆对象
        Class clazz = Person.class;

        Person o = (Person)clazz.newInstance();

        Field field = clazz.getField("age");
        field.set(o,123);
        Object age = field.get("age");
        System.out.println(age);
        System.out.println(o.getAge());

        Constructor constructor = clazz.getConstructor();


    }
}
