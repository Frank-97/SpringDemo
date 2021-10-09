package com.znl.java.Thread;


import java.util.concurrent.*;


class Window1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadPoolTest {

    public static void main(String[] args) {

        ThreadPoolExecutor executors = new ThreadPoolExecutor(10,
                10,100,TimeUnit.SECONDS, new ArrayBlockingQueue<>(100),new ThreadPoolExecutor.CallerRunsPolicy());

        Runnable w1 = new Window1();
        executors.execute(w1);

        executors.shutdown();//终止线程
    }
}
