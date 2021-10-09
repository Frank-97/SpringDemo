package com.znl.java.finalz;

/**
 * 不能继承动物类，因为不能继承final修饰的类
 */
public class Monkey extends Aniamal{

    @Override
    public void walk(){
        System.out.println("Monkey eat banana~~~~~~");
    }
}
