package com.rtx.thread.intro1;


class Athread extends Thread{


    @Override
    public void run() {
        super.run();
        for(int i =0;i<100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        Athread athread = new Athread();
        athread.start();
        for(int i =0;i<100;i++){
            System.out.println("World");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
