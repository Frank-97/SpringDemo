package com.znl.java.Thread;



public class SingleTest {

    private static volatile SingleTest singleTest = null; //禁止指令重排 volatile

    private SingleTest(){

    }

    public static SingleTest getInstance(){

        if(singleTest == null){  //提升一点性能 不需要多个线程同时等待
            synchronized (SingleTest.class){
                if(singleTest == null){
                    singleTest = new SingleTest();
                }
            }
        }
        return singleTest;
    }

    public static void main(String[] args) {

        new Thread(new Runnable() {
           @Override
           public void run() {
               SingleTest instance1 = SingleTest.getInstance();
               System.out.println(instance1);
           }
       }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SingleTest instance = SingleTest.getInstance();
                System.out.println(instance);
            }
        }).start();
    }

}
