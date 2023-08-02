package Thread_Practice;

// 2. 인터페이스 구현방법
class MyThread_Implements implements Runnable {


    @Override
    public void run() {
        int i;

        for (i = 1; i <= 200; i++) {
            System.out.println(i + "\t");
        }
    }
}
