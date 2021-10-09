package com.znl.java.Thread;

/**
 *
 * 第二种方式：创建线程
 * 1、创建类并实现Runable接口
 * 2、子类重写run方法
 * 3、创建子类实例
 * 4、创建Thread类，将实现Runable的类 通过形参的方式 传递
 * 5、通过创建Thread类启动线程并执行run方法
 *
 * 共享数据：多个线程同时操作一个变量 （会出现安全隐患）
 *
 * synchronized(obj)
 * 同步锁：多个线程执行到同步代码块的时候只能有一个线程拿到锁，其它线程处于等待状态，直到拿到锁的线程执行完同步代码块中的代码
 * 同步监视器：可以将任意对象当作同步监视器
 *           隐藏信息，多个线程必须用同一个锁（同步监视器）
 */
class WindowDemo implements Runnable{

    private int ticket = 100;
    private Object obj = new Object();
    @Override
    public  void run() {
            while (true){
                synchronized(obj){
                    if(ticket > 0){
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+": "+ticket);
                        ticket--;
                    }else {
                        break;
                    }
                }
            }
    }
}

public class RunableDemo {


    public static void main(String[] args) {
        WindowDemo w1 = new WindowDemo();
       new Thread(w1).start();
       new Thread(w1).start();
       new Thread(w1).start();
    }
}
