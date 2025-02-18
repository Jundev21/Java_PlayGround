package Thread.Sync;

public class WithDrawThread implements Runnable {

    private BankAccount bankAccount;
    private int amount;

    public WithDrawThread(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}
