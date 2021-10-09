package com.swj.test.extendz;

import com.znl.java.extendz.Person;
import com.znl.java.extendz.Student;
import com.znl.java.extendz.Worker;
import org.junit.Test;

import java.util.Date;

public class InstancofTest {


    @Test
    public void testInstanceOf(){

        Person student1 = new Student("123",1,new Date(),"123");
        Person student2 = new Student("123",1,new Date(),"123");
        Person student3 = new Student("123",1,new Date(),"123");
        Person worker1 = new Worker("123",1,new Date());
        Person worker2 = new Worker("123",1,new Date());


        int workerCount = 0;
        int studentCount = 0;
        Person[] persons = {student1,student2,student3,worker1,worker2};
        for (Person person:persons) {
            if(person instanceof Worker){
                workerCount++;
            }
            if(person instanceof Student){
                studentCount++;
            }
        };

        System.out.println("workerCount "+workerCount);
        System.out.println("studnetCount "+studentCount);
    }
}
