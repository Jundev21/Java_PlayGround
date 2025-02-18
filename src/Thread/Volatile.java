package Thread;

import java.util.logging.Logger;

public class Volatile {

    public static void main(String[] args) throws InterruptedException {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask, "mytask");
        System.out.println("runFlg = " + myTask.runFlag);

        thread.start();

        Thread.sleep(1000);

        System.out.println("runFlg = " + myTask.runFlag);
        myTask.runFlag = false;
        System.out.println("runFlg = " + myTask.runFlag);
        System.out.println("main 종료");
    }

    static class MyTask implements Runnable {
//        boolean runFlag = true;
        volatile boolean runFlag = true;

        @Override
        public void run() {
            System.out.println("스레드 시작!");

            while(runFlag) {
            }

            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("스레드 종료");


        }
    }
}
