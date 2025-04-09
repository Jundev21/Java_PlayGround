package Thread.Consumer;

public class Consumer implements Runnable {

    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        System.out.println("[소비 시도] " + buffer.toString());
        try {
            buffer.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("[소비 완료] " + buffer.toString());
    }
}