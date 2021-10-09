package com.znl.java.extendz;

import java.util.Date;

public class Student extends  Person{

    public String school;

    public int value;

    public Student(){

    }

    public Student(String name, int age, Date birthDate,String school) {
        super(name, age, birthDate);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    @Override
    public void setValue(){
        this.value = 20;
        super.setValue();
    }

    public void print(){
        System.out.println("value "+this.value);
        System.out.println("value "+super.value);
    }

    @Override
    public void println(){
        System.out.println("Student~~~~~~~~~~~~");
    }
}
