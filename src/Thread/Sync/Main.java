package Thread.Sync;


//출금 처리하는 스레드

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount1 = new ReentrantLock3(100);

        Thread thread1 = new Thread(new WithDrawThread(bankAccount1,70),"WithDrawThread1");
        Thread thread2 = new Thread(new WithDrawThread(bankAccount1,50),"WithDrawThread2");

        thread1.start();
        thread2.start();

        Thread.sleep(500);
        System.out.println("t1 states : " + thread1.getState());
        System.out.println("t2 states : " + thread2.getState());

        thread1.join();
        thread2.join();

        System.out.println("total amount : " + bankAccount1.getBalance());
        System.out.println("end main thread");
    }
}
