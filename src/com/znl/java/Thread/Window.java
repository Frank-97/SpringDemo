package com.znl.java.Thread;

/**
 * 案例：卖票  三个窗口共同卖100张票
 * 有安全问题带解决
 *  使用同步锁解决 共享数据安全隐患
 */
class WindowTransaction extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();
    @Override
    public void run() {
            while (true){
                synchronized (obj){
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(ticket > 0){
                        System.out.println(Thread.currentThread().getName()+": "+ticket);
                        ticket--;
                    }else {
                        break;
                    }
                }
            }
    }
}



public class Window {

    public static void main(String[] args) {
        WindowTransaction w1 = new WindowTransaction();
        WindowTransaction w2 = new WindowTransaction();
        WindowTransaction w3 = new WindowTransaction();
        w1.start();
        w2.start();
        w3.start();

    }



}
