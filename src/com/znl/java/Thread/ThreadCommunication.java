package com.znl.java.Thread;

/**
 *
 *
 *线程的通信
 * 案例: 两个线程交替打印1~100
 * wait() 使当前线程挂起，并放弃CUp
 */

class ThreadCom implements Runnable{

    private int ticket = 0;
    @Override
    public void run() {

        while (true){
            synchronized (this){
                notify();
                if(ticket<=100){
                    System.out.println(Thread.currentThread().getName()+": "+ticket);
                    ticket++;
                }else{
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

     }
}





public class ThreadCommunication {

    public static void main(String[] args) {
        ThreadCom th = new ThreadCom();

        new Thread(th).start();
        new Thread(th).start();

    }
}
