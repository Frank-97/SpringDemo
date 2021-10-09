package com.znl.java.extendz;

import java.math.BigDecimal;
import java.util.Date;

public class Worker extends Person{

    public BigDecimal salary;

    public String overTime;

   public Worker(){

   }

    public Worker(String name, int age, Date birthDate) {
        super(name, age, birthDate);
    }

    @Override
    public void println(){
        System.out.println("Worker~~~~~~~~");
    }
}
