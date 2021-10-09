package com.znl.java.Thread;

/**
 * 饿汉式
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){

    }

    public static HungrySingleton  getInstance(){
        return hungrySingleton;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                HungrySingleton instance = HungrySingleton.getInstance();
                System.out.println(instance);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                HungrySingleton instance = HungrySingleton.getInstance();
                System.out.println(instance);

            }
        }).start();
    }
}
