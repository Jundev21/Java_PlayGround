package Thread.Control;


import java.lang.Thread;
import java.util.logging.Logger;

public class JoinThread {

    static Logger logger = Logger.getLogger("JoinThread");
    public static void main(String[] args) throws InterruptedException {

        logger.info("시작");

        Job result1 = new Job(1,50);
        Job result2 = new Job(51,100);

        Thread thread1 = new Thread(result1,"thread1");
        Thread thread2 = new Thread(result2,"thread2");

        thread1.start();
//        thread2.start();


        // 두 스레드의 계산이 모두 끝날때까지 대기
        thread1.join(1000);
        thread2.join(4000);

        logger.info("task1.result =" + result1.result);
        logger.info("task2.result =" + result2.result);

        logger.info("결과" + (result1.result + result2.result));

        logger.info("종료");
    }

    static class Job implements Runnable {

        private int start = 0;
        private int end = 0;
        private int result = 0;


        public Job(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {

            try {
                logger.info("작업 시작");
                Thread.sleep(2000);
                result = calcNum();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            logger.info("작업 종료" + result);
        }

        private int calcNum() {
            for(int i = start; i <= end; i++) {
                result += i;
            }
            return result;
        }
    }
}
