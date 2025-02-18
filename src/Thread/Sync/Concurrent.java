package Thread.Sync;


import java.util.concurrent.locks.LockSupport;

//고급 동기화
// Syncronized - 무한대기
// LockSupport - Blocked 상태 스레드 락 풀릴때 까지 무한 대기 문제를 해결해줌
// LockSupport - 스레드 상태를 Waiting 으로 변경해줌
// CPU 스케쥴링에 들어가지않음
// 1. park() - waiting 상태변경
// 2. parkNanos(nanos) - waiting 상태 나노초
// 3. unpark(thread) - waiting 상태의 대상 runnable 변경
public class Concurrent {

    public static void main(String[] args) throws InterruptedException {
        ConCurrentTest test = new ConCurrentTest();
        Thread t1 = new Thread(test);
        t1.start();
        Thread.sleep(1000);
        System.out.println("Thread " + t1.getState()+ " is running");
//        LockSupport.unpark(t1);
        t1.interrupt();
        System.out.println("Thread " + t1.getState()+ " is interrupted");

    }

    static class ConCurrentTest implements Runnable {

        @Override
        public void run() {
            System.out.println("park 시작");
            LockSupport.parkNanos(2000_000000);
            System.out.println("park 종료 , state : " + Thread.currentThread().getState());
            System.out.println("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }

}
