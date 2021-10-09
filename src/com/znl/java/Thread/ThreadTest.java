package com.znl.java.Thread;

class SubThread extends Thread {

    @Override
    public void run() {
        for (int i = 0;i <= 100;i++){
            System.out.println("子线程"+i);
        }
    }
}

/**
 * 1、子类继承Thread类
 * 2、子类重写run方法
 * 3、实例化子类
 * 4、子类调用start()方法
 * start()作用 调用run方法 并开启一个线程
 *
 */

public class ThreadTest {
    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        subThread.start();

        for (int i = 0;i <= 100;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
