package Thread;

public class ThreadYield {

    static final int THREAD_COUNT = 100;

    public static void main(String[] args) {

        for(int i=0; i<THREAD_COUNT; i++) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();

        }
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for(int i=0; i<10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                //1. empty - 그대로
                //2. sleep - sleep(1)
//                    runnable의 두가지 상태
//                    1. 대기스케쥴링에서 실세 cpu 의 실행을 대기
//                    2. 실제 cpu에서 실행이 되는거
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                //3. yield Thread.yield();
                Thread.yield();
            }
        }
    }
}
