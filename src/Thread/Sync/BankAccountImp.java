package Thread.Sync;

public class BankAccountImp implements BankAccount {

    private double balance;

    public BankAccountImp(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(double amount) {
        System.out.println("start withdrawing " + amount + " from bank" + getClass().getSimpleName());
        // 찾는 금액보다 보유 금액이 적으면 false

        // 임계영역 부분 시작 synchronized 키워드를 사용해서 락을 사용
        synchronized (this) {
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
        }
        System.out.println("end withdrawing " + amount + " from bank" + getClass().getSimpleName());
        return true;
    }

    @Override
    public synchronized double getBalance() {
        return balance;
    }
}
