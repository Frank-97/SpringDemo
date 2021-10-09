package com.znl.java.Thread;

/**
 *
 * Thread常用Api
 * 1、setName(String name) 设置当前线程名称
 * 2、getName() 获取当前线程名称
 * 3、currentThread() 获取当前线程
 * 4、join() 执行完当前线程工作，其它线程阻塞状态
 * 5、yield() 放弃执行权，让cpu在去定夺调度哪个线程 也有可能是自己 也有可能是别人
 * 6、sleep(millis) 让当前线程处于睡眠状态   millis 1000毫秒 = 1秒
 * 7、setPriority() 设置线程优先级  默认优先级为5  最大值为10  最小值为1
 * 优先级只是概率上优先级比较高 但是不会真正的先执行优先级高的
 *
 *
 */
class MyThread extends Thread{
    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+": "+ i);
            }
        }
    }
}




public class ThreadApiDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        //t1.join();
        //t1.yield();
        t2.start();
        System.out.println(t1.isAlive());
    }
}
