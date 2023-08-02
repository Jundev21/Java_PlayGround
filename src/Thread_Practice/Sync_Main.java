package Thread_Practice;


class Park extends Thread{
    @Override
    public void run(){
        System.out.println("Start save");
        try {
            Sync_Main.myBank.saveMoney(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Success save money " + Sync_Main.myBank.getInitMoney());
    }
}


class ParkWife extends Thread{
    @Override
    public void run(){
        System.out.println("Start minus");
        try {
            Sync_Main.myBank.minusMoney(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Success minus money " + Sync_Main.myBank.getInitMoney());
    }
}





public class Sync_Main {

    public static SyncThread myBank = new SyncThread();
    public static void main(String[] args) throws InterruptedException {

        Park p = new Park();
        p.start();

        Thread.sleep(2000);

        ParkWife w = new ParkWife();

        w.start();
    }
}
