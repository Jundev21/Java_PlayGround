package Thread.Consumer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Queue 선택
//        QueueBuffer buffer = new QueueBuffer(2);
//        Buffer buffer = new LockQueueBuffer2(2);
        BoundedQueue buffer = new BoundedQueue(2);

        // 생산자 먼저실행

        consumerFirst(buffer);

        // 소비자 먼저 실행

    }

    private static void consumerFirst(Buffer queue) throws InterruptedException {

        List<Thread> threadList = new ArrayList<Thread>();
        System.out.println("소비자자 먼저 시작" + queue.getClass().getSimpleName());

        startConsumer(threadList, queue);
        printAllState(threadList);
        startProducer(threadList, queue);
        printAllState(threadList);

        System.out.println("소비자 종료" + queue.getClass().getSimpleName());
    }

    private static void producerFirst(Buffer queue) throws InterruptedException {

        List<Thread> threadList = new ArrayList<Thread>();
        System.out.println("생산자 먼저 시작" + queue.getClass().getSimpleName());

        startProducer(threadList, queue);
        printAllState(threadList);
        startConsumer(threadList, queue);
        printAllState(threadList);

        System.out.println("생산자 종료" + queue.getClass().getSimpleName());
    }

    private static void startConsumer(List<Thread> threadList, Buffer queue) throws InterruptedException {
        System.out.println("소비자 시작");
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(new Consumer(queue), "producer " + i);
            threadList.add(thread);
            thread.start();
            Thread.sleep(100);
        }

    }

    private static void printAllState(List<Thread> threadList) {
        System.out.println("현재상태 출력");
        for (Thread thread : threadList) {
            System.out.println(thread.getName() + " : " + thread.getState() + " : " + thread.getState());

        }
    }

    private static void startProducer(List<Thread> threadList, Buffer queue) throws InterruptedException {
        System.out.println("생산자 스레드 시작");
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(new Producer(queue, String.valueOf(i)));
            threadList.add(thread);
            thread.start();
            Thread.sleep(3000);
        }

    }

}
