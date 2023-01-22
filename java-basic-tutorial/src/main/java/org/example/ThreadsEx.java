package org.example;

public class ThreadsEx extends Thread {
    static  public ThreadsEx newThread1 = new ThreadsEx();
    public ThreadsEx(){

        Thread showWordThread = new Thread(new Runnable() {
            @Override public void run() {
                while (1==1) {
                    try {
                        System.out.println("111111");
                        sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }
            }
        });
        showWordThread.start();

        Thread showWordThread2 = new Thread(new Runnable() {
            @Override public void run() {
                while (1==1) {
                    try {
                        System.out.println("2222222");
                        sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }
            }
        });
        showWordThread2.start();



    }
}
