package Thread.Sync;

/*
    Syncfhronized 단점
     blocked 상태의 스레드는 락이 풀릴때까지 무한 대기
     특정 시간까지만 대기
     중간에 인터럽트  모함
    공정성
    락이 돌아왔을때 blocked 상태의 여러스레드중에 어떤 스레드가 락을 획득할수있는지 알 수 가없다.

     void lock()
    인터럽트에 응답하지않음
    중간에 포기하지않고 계속해서 락을 기다린다.
    synchronized 에서만 사용됨.

    void lockInterruptibly()
    락 시도할때 다른 스레드가 인터럽트할 수 있도록한다.
    다른 스레드가 이미 락을 획득했다면, 현재 스레드는 락을 획득할때까지 기다린다.

    void unlock()
    ReenterantLock - 오래 기다린 스레드가 먼저 들어올수 있도록
    비공정 모드 - 락을 풀었을때 대기중인 스레드중 아무나 락을 획들할 수 있다.
     락 획득 속도 빠름, 새로운 스레드가 기존 락보다 먼저 획득 할 수 도있음

     공정모드
    락을 요청한 순서대로 락을 획득할수잇다.
      속도 느려질 수 있다.
     공정모드가 중요할 경우 fair 모드

*/

import java.util.concurrent.locks.ReentrantLock;

public class Reenterence {


}

