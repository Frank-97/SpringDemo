package com.znl.java.Annotation;

/**
 * @Package: com.znl.java.Annotation
 * @ClassName: Person
 * @Author Frank
 * @Data 2021-08-06-23:14
 * @Description:
 * 元注解学习：
 * @Retention （中文含义：保留）
 *    作用：提供注解的生命周期
 *   （1）提供枚举类 RetentionPolice
 *    (2)source:编译之后结束  class(默认行为behavior)：编译后存在存在类中  runtime：编译和运行时都存在 运行时由VM保留
 * @Target (中文含义:目标)
 *    (1) 作用：提供注解的作用域或者说是范围，
 *    (2) 提供枚举类ElementType
 *    (2) Type 可以在类 接口 枚举类上使用注解,PACKAGE 用于描述包，METHOD 用于描述方法，LOCAL_VARIABLE 用于描述局部变量
 *    CONSTRUCTOR 用于描述构造方法 PARAMETER 用于描述参数 FIELD 用于描述域
 *
 * @Inherited  (中文含义：继承的，遗传的)
 *     作用：子类继承父类后 父类中使用的注解中存在inherited都可以被子类继承
 * @Documented (中文含义：文档) 可以被javadoc文档中存在
 */
@MyAnnotation(value = "defineAnnotation")
public class Person {

  private String name;
  private String age;

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
}



class Student extends Person{

    public static void main(String[] args) {
        Class<Student> clazz = Student.class;
        MyAnnotation myAnnotation = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.value());
    }
}