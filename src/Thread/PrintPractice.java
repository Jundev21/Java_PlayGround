package Thread;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class PrintPractice {

    // 여러스레드가 있건말건 메인이 종료되면 모든 스레드가 종료된다.
    // 스레드를 실행하는이유
    // 메인스레드는 프로그램을 종료시키지않고 실행해준다. 스레드는 프로그램의 내부 코드를 실행한다고 생각하면됨.
    // 메인스레드 => 시스템 , 스레드 => 시스템에서 실행하는 프로그램


    public static void main(String[] args) {

        PrintPracticeThread printPrac = new PrintPracticeThread();
        Thread currThread = new Thread(printPrac, "tt");

        System.out.println("시스템 시작");
        System.out.println("q 클릭시 프로그램종료");
        currThread.start();
        Scanner scanner = new Scanner(System.in);




        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("q")) {
                currThread.interrupt();
                break;
            }
            printPrac.add(userInput);
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
