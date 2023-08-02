package Thread_Practice;


// synchronized 는 실행중인 스레드가 실행이 완료되면 다른스레드로 넘어간다.

public class SyncThread {

    private int initMoney = 10000;

    public synchronized void saveMoney(int save) throws InterruptedException {
        int m = getInitMoney();

        //sleep 은 thread 의 static 메서드이다.
        Thread.sleep(3000 );
        setInitMoney(m+save);

    }

    public synchronized void minusMoney(int minus) throws InterruptedException {

        int m = getInitMoney();
        Thread.sleep(2000);
        setInitMoney(m-minus);
    }




    public int getInitMoney() {
        return initMoney;
    }

    public void setInitMoney(int initMoney) {
        this.initMoney = initMoney;
    }
}
