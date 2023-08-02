package Thread_Practice;

// 1. java.thread.lang 모든 매서드 상속 - Thread(Runnable target) 메서드 사용
// 두개의 thread 가 스위치 되면서 실행이된다.
class MyThread_extends extends Thread {

    @Override
    public void run() {
        int i;

        for (i = 1; i <= 200; i++) {
            System.out.println(i + "\t");
        }
    }
}
