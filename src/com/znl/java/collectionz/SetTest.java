package com.znl.java.collectionz;

import org.junit.Test;

import java.util.*;

/**
 * @Package: com.znl.java.collectionz
 * @ClassName: SetTest
 * @Author Frank
 * @Data 2021-08-22-18:14
 * @Description: Set集合测试
 *    Set：无序，不重复
 *       无序：是指 添加的数据没有按照数组索引的位置依次添加，而是通过值的Hashcode()，在通过某种算法计算出放在数组中的哪个位置
 *       不重复：是指 通过equals()方法 判断是否一致，一致则不添加数据
 *       /----HashSet()
 *          HashSet()作为Set的主要实现类
 *            1、添加数据时先计算HashCode()，然后通过算法算出放到数组的哪个位置，如果没有元素直接添加，如果有元素
 *            通过equals()方法比较
 *       /------LinkedHashSet()
 *           LinkedHashSet()是HashSet的子类
 *       /----TreeSet()
 *           TreeSet() 可以按照自然排序或者指定排序的遍历
 *
 *
 *     Set总结：数组+链表的方式；
 */
public class SetTest {

    @Test
    public void test1(){
        Set set = new HashSet();

        set.add("123");
        set.add("456");
        set.add(new User("Frank","18"));
        set.add(new User("Frank","18"));
        set.add(new User("Mary","26"));
        set.add(123);
        set.add("789");
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    @Test
    public void test10(){

        Set set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    if(u1.getName() != u2.getName()){
                        return u1.getName().compareTo(u2.getName());
                    }
                    if(u1.getAge() != u2.getAge()){
                        return u1.getAge().compareTo(u2.getAge());
                    }
                }
                return 0;
            }
        });

        set.add(new User("Frank","18"));
        set.add(new User("Mary","26"));
        set.add(new User("Admin","26"));
        set.add(new User("Admin","23"));
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    @Test
    public void testHashCode(){

        User user1 = new User("Frank","18");
        User user2 = new User("Frank","18");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }

}

class User implements Comparable{

    private String name;
    private String age;

    public User(String name, String age) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User)o;

            return this.name.compareTo(user.name);
        }
        return 0;
    }
}