package com.znl.java.collectionz;


import org.junit.Test;

import java.util.*;

/**
 * @Package: com.znl.java.collectionz
 * @ClassName: CollectionTest
 * @Author Frank
 * @Data 2021-08-08-17:13
 * @Description:
 * Collection接口中方法学习
 *
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        //add() 保证集合中包含指定的元素
        coll.add("123");
        coll.add("456");
        coll.add(new Date());
        coll.add(new Person("张三","18"));
        System.out.println(coll);
        List<String> strings = Arrays.asList("123", "345");
        //addAll() 将指定的集合元素添加到此集合中
        coll.addAll(strings);

        //clear() 删除指定集合的所有元素
        //coll.clear();
        System.out.println(coll);

        //contains() 判断集合中是否存在指定的元素 存在返回true 否则false
        //注意：contains比较的是值 如果重写了equals()则比较值，否则地址
        boolean contains = coll.contains(new String("456"));
        System.out.println(contains);
        boolean contains1 = coll.contains(new Person("张三", "18"));
        System.out.println(contains1);

        //containsAll() 如果此集合包含指定集合中的元素 返回true
        boolean b = coll.containsAll(strings);
        System.out.println(b);
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add("123");
        coll.add("456");
        coll.add(new Date());
        coll.add(new Person("张三","18"));

        Collection coll1 = new ArrayList();
        coll1.add("123");
        coll1.add("456");
        coll1.add(new Date());
        coll1.add(new Person("张三","18"));


        //equals() 指定一个对象与此集合进行比较 也是值比较
        boolean equals = coll.equals(coll1);
        System.out.println(equals);

        //hashCode() 获取hash值
        int i = coll.hashCode();
        int i1 = coll1.hashCode();
        System.out.println(i+"    "+i1);

        //判断当前集合是否存在元素 如果不存在返回true
        Collection coll2 = new ArrayList();
        coll2.add("1");
        boolean empty = coll2.isEmpty();
        System.out.println(empty);

    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add("123");
        coll.add("456");
        coll.add(new Date());
        coll.add(new Person("张三","18"));



        //size() 返回集合中元素的个数
//        System.out.println(coll+"   元素个数"+coll.size());

        //remove() 移除集合中指定的元素  如果输入一个不存在的元素则不删除任何元素
//        coll.remove("123");
//        System.out.println(coll+"   元素个数"+coll.size());

//        boolean b = coll.removeAll(coll);
//        System.out.println(b+""+coll);

        //retainAll(Collection c) 只保留当前集合中包含在指定集合中的元素
        Collection coll1 = new ArrayList();
        coll1.add("123");
        coll.retainAll(coll1);
        System.out.println(coll);



    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add("123");
        coll.add("456");
        coll.add(new Date());
        coll.add(new Person("张三","18"));

        Iterator iterator = coll.iterator();

        //hashNext() 判断是否存在下一个元素
        while (iterator.hasNext()){
            //next() 做了两件事  一个是先将当前指针指向下一个元素，另一个是将指向的元素信息返回
            System.out.println(iterator.next());
        }
    }
}

class Person{
    private String name;
    private String age;

    public Person(String name,String age){
        this.name = name;
        this.age = age;
    }
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

