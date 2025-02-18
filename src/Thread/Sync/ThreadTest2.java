package Thread.Sync;

public class ThreadTest2 {
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

}
