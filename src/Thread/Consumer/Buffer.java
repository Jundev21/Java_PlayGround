package Thread.Consumer;

public interface Buffer {
    void put(String value);
    String take();
}
