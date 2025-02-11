package Thread;

import java.util.logging.Logger;

public class JoinTest1Main {
    public static void main(String[] args) throws InterruptedException {

        Logger logger = Logger.getLogger(JoinTest1Main.class.getName());
        MyTask myTask = new MyTask();
        new Thread(myTask, "workThead").start();

        Thread.sleep(4000);

        logger.info("stop flag change false");
        myTask.flag = false;
    }

    static class MyTask implements Runnable {

        volatile boolean flag = true;

        @Override
        public void run() {
            Logger logger = Logger.getLogger("MyTask");
            while (flag) {
                logger.info("작업중");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            logger.info("정리중... 종료");
        }
    }
}