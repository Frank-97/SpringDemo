package com.znl.java.Thread;

import java.util.concurrent.locks.ReentrantLock;

class Windows implements Runnable{

    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true){
            try{
                lock.lock();
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":票号 "+ticket);
                    ticket--;
                }else{
                    break;
                }
            }catch (Exception ex){

            }finally{
                lock.unlock();
            }

        }
    }
}


public class LockTest {
    public static void main(String[] args) {
        Windows w1 = new Windows();
        new Thread(w1).start();
        new Thread(w1).start();
        new Thread(w1).start();
    }
}
