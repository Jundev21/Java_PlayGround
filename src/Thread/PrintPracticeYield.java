package Thread;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class PrintPracticeYield {

    // yield 는 실행중인 스레드 상태를 , 스케쥴링 대기큐로 추가돼서 다음 스레드가 실행되도록 한다.

    public static void main(String[] args) {
        PrintPracticeThread printPrac = new PrintPracticeThread();
        PrintPracticeThread printPrac2 = new PrintPracticeThread();
        Thread currThread = new Thread(printPrac, "tt");
        Thread currThread2 = new Thread(printPrac2, "tt2");

        System.out.println("시스템 시작");
        System.out.println("q 클릭시 프로그램종료");
        currThread.start();
        currThread2.start();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("q")) {
                currThread.interrupt();
                currThread2.interrupt();
                break;
            }
            printPrac.add(userInput);
            printPrac2.add(userInput);
        }
        System.out.println("시스템 종료");
    }

    static class PrintPracticeThread implements Runnable {

        // 스레드를 종료시킬수 있는 플레그
        volatile boolean flag = true;
        //프린트 큐를 담는 컬렉션
        Queue<String> queue = new ConcurrentLinkedQueue<>();

        @Override
        public void run() {

            System.out.println("프린트 시작");

            while (!Thread.currentThread().isInterrupted()) {
                try {
                    if (queue.isEmpty()) {
                        Thread.yield();

                        Thread.sleep(1000);
                        continue;
                    }
                    Thread.sleep(4000);
                    String currWord = queue.poll();
                    System.out.println("출력중 : " + currWord + " " + queue);
                } catch (InterruptedException e) {
                    System.out.println(" 프린트 중단");
                    break;
                }
            }

            System.out.println("프린트 종료" + Thread.currentThread().isInterrupted());
        }

        public void add(String input) {
            queue.add(input);
        }


    }
}
