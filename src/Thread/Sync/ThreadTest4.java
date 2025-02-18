package Thread.Sync;

import java.util.concurrent.locks.LockSupport;

public class ThreadTest4 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Counter(), "Thread-1");
        t1.start();

        Thread.sleep(100);
        System.out.println("Thread State: " + t1.getState());

    }

    static class Counter implements Runnable {
        @Override
        public void run() {
            System.out.println("count 시작");
            LockSupport.parkNanos(2000_00000);
            System.out.println("count 종료, stat : " + Thread.currentThread().getState());
            System.out.println("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }

/*
    Syncfhronized 단점
     blocked 상태의 스레드는 락이 풀릴때까지 무한 대기
     특정 시간까지만 대기
     중간에 인터럽트  모함
    공정성
    락이 돌아왔을때 blocked 상태의 여러스레드중에 어떤 스레드가 락을 획득할수있는지 알 수 가없다.
*/
}
