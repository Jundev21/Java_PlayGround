package Thread.Service;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Logger;

public class SecondThread {
    static Logger logger = Logger.getLogger("SecondThread");

    public static void main(String[] args) {

        Printer printer = new Printer();
        Thread thread = new Thread(printer, "Printer");
        thread.start();

        Scanner userInput = new Scanner(System.in);
        while (true) {
            logger.info("문자클릭 시 종료");
            String input = userInput.nextLine();
            if (input.equals("q")) {
                printer.flag = false;
                break;
            }
            printer.add(input);
        }

    }


    static class Printer implements Runnable {

        volatile boolean flag = true;
        // 여러 스레드가 접글할수 있는 자료구조는 주로 concurrent 가 붙은 자료구조를 사용한다.
        // 동시성에 대한 문제점때문에 사용한다.
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();


        @Override
        public void run() {
            while(flag){
                if(jobQueue.isEmpty()){
                    continue;
                }
                String job = jobQueue.poll();

                logger.info("작업시작 " + job + ":"+ jobQueue );
                try {
                    Thread.sleep(3000);
                    logger.info("출략완료");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            logger.info("프린터 종료");
        }

        public void add(String input) {
            jobQueue.offer(input);
        }
    }
}
