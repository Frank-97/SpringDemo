package com.znl.java.clazz;

/**
 * @Package: com.znl.java.clazz
 * @ClassName: Persoin
 * @Author Frank
 * @Data 2021-09-21-21:26
 * @Description:
 */
public class Person {

    private String name;
    public int age;


    public Person(){
        System.out.println("无参构造方法");
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    private Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
