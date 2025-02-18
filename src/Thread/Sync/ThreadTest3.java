package Thread.Sync;

public class ThreadTest3 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                counter.count();
            }
        };

        Thread thread = new Thread(runnable,"thread1");
        Thread thread2 = new Thread(runnable,"thread2");

        thread.start();
        thread2.start();

    }

    // 스택영역은 각각 스레드가 갖는 별도의 메모리 공간
    // 메모리 공간은 다른 스레드와 공유하지않음
    // 지역변수는 스레드의 개별 저장 공간인 스택 영역에 생성
    // 스레드 지역변수는 다른 스레드와 절대 공유하지않는다.


    static class Counter {

        public void count(){
            int localValue =0;
            for(int i=0;i<1000;i++){
                localValue+=1;
            }
            System.out.println("결과" + localValue);
        }
    }


    class Immutable {
        private final int value;

        public Immutable(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
//synchronized
// 두개 이상의 스레드가 공통 자원에 접근할때 동시성 문제를 해결해 주기위해 사용
// 동작원리는 스레드가 접근할때 락이 걸려있는지 아닌지 확인 후에
// 락이 안걸려있으면 동작이 시작되고 만약 락이 안걸려 있을 경우 다른 스레드가 대기한다.

//단점
//스레드 상태가 대기 일 경우 무한 대기상태로 빠질 수 있다.
//이 전 스레드가 락이 풀려야 다음 스레드가 진행되는데 락이 풀리지않고 계속 락이 걸리기때문.
//공정성 - 락이 안걸려있을때 대기중인 스레드중 어떤 스레드가 먼저 실행될것인지 알 수 가없다.
// 최악의 경우는 순서를 잡지못한 스레드는 계속해서 순위가 뒤로 밀릴수가있음.
