package Thread;

import java.util.logging.Logger;

public class JoinTest3Main {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = Logger.getLogger(JoinTest3Main.class.getName());
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "myThread");
        logger.info("thread start");
        thread.start();
        Thread.sleep(50);
        logger.info("thread interrupted");
        thread.interrupt();
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            Logger logger = Logger.getLogger("MyTask");

            while (!Thread.interrupted()) {
                logger.info("working now");
            }

//            while (!Thread.currentThread().isInterrupted()) {
//                logger.info("working now");
//            }

            logger.info("stop flag change false");

            try {
                logger.info("annother working");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                logger.info(Thread.currentThread().isInterrupted() + " current interrupted info");
                logger.info("interrupted");
                throw new RuntimeException(e);
            }
            logger.info("the ended");

        }
    }
}