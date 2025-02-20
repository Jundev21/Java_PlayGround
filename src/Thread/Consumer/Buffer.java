package Thread.Consumer;

public interface Buffer {
    void put(String value) throws InterruptedException;
    String take() throws InterruptedException;
}
