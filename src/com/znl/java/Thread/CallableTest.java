package com.znl.java.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

class ThreaNew implements Callable{

    private int sum = 0;
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
            sum += i;
        }
        return sum;
    }
}

public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable callable = new ThreaNew();

        FutureTask futureTask = new FutureTask(callable);

        new Thread(futureTask).start();

        Object o = futureTask.get();
        System.out.println("总和为: "+o);
    }



}
