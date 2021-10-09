package com.znl.java.Thread;

class ShareData implements Runnable{

    private StringBuilder s1 = new StringBuilder();
    private StringBuilder s2 = new StringBuilder();

    @Override
    public void run() {
        synchronized (s1){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s1.append("a");
            synchronized (s2){
                s2.append("c");
            }
        }

        synchronized (s2){
            s1.append("b");
            synchronized (s1){
                s2.append("d");
            }
        }
        System.out.println(s1.toString()+s2.toString());
    }

}

public class DieLockTest {
    public static void main(String[] args) {
        ShareData s = new ShareData();
        new Thread(s).start();
        new Thread(s).start();
    }
}
