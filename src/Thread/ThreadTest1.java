package Thread;

public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println("total amount : " + counter.getCount());
    }

    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count += 1;
        }

        public int getCount() {
            return count;
        }
    }

}
