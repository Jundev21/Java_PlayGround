package Thread;

import java.util.logging.Logger;

public class JoinTest2Main {
    public static void main(String[] args) throws InterruptedException {

        Logger logger = Logger.getLogger(JoinTest2Main.class.getName());
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask, "workThead");

        thread.start();

        Thread.sleep(10);
        logger.info("stop flag change false");

        thread.interrupt();
        logger.info("work 스레드 인터럽트상태");
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            Logger logger = Logger.getLogger("MyTask");

                while (!Thread.currentThread().isInterrupted()) {
                    logger.info("작업중");
                }

                logger.info("current intter" + Thread.currentThread().isInterrupted());
            logger.info("정리중... 종료");
        }
    }
}