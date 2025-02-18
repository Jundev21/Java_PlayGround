package Thread.Sync;

import java.util.concurrent.locks.Lock;

public class ReentrantLock2 implements BankAccount {

    private double balance;
    private final Lock lock = new java.util.concurrent.locks.ReentrantLock();

    public ReentrantLock2(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(double amount) {
        System.out.println("start withdrawing " + amount + " from bank" + getClass().getSimpleName());
        // 찾는 금액보다 보유 금액이 적으면 false

        if(!lock.tryLock()) {
            System.out.println("[진입 실패] 이미 처리중인 작업이있음");
            return false;
        }


        lock.lock(); // reenterantlock 을 이용하여 lock 을 걸기
        // 임계영역 부분 시작 synchronized 키워드를 사용해서 락을 사용

        try {
            System.out.println("Start Checking " + amount + " from bank" + balance);
            if (balance < amount) {
                System.out.println("amount is negative");
                return false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            balance -= amount;
            System.out.println("success withDrawing, balance is " + balance);
            // 임계영역 부분 종료

        } finally {
            lock.unlock();
        }

        System.out.println("end withdrawing " + amount + " from bank" + getClass().getSimpleName());
        return true;
    }

    @Override
    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}
