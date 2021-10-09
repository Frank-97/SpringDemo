package com.swj.test.extendz;

import com.znl.java.extendz.Person;
import com.znl.java.extendz.Student;
import com.znl.java.extendz.Worker;
import org.junit.Test;

import java.util.Date;

public class ExtendzTest {

    /**
     * 测试 继承关系及 成员变量隐藏和成员方法覆盖
     */
    @Test
    public void extendsTest(){

        Student student = new Student("Frank",12,new Date(),"青岛");
        student.setValue();
        student.print();
    }

    /**
     *polymorphic
     */
    @Test
    public void TestPolymorphic(){
        Person student = new Student();
        Person worker = new Worker();
        student.println();
        worker.println();
    }
}
