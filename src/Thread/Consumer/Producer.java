package Thread.Consumer;

public class Producer implements Runnable {

    private Buffer buffer;
    private String value;

    public Producer(Buffer buffer, String value) {
        this.buffer = buffer;
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println("[생산시도] " + value + "->" + buffer);
        buffer.put(value);
        System.out.println("[생산완료] " + value + "->" + buffer);

    }
}
