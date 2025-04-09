package Thread.Consumer_Producer;

public class Consumer_thread implements Runnable {

    private final Imple_buffer imple_buffer;
    private String value;

    public Consumer_thread(Imple_buffer imple_buffer, String value) {
        this.imple_buffer = imple_buffer;
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println("소비자 데이터 소비 시작");
        imple_buffer.extractData();
        System.out.println("소비자 데이터 소비 끝남");
    }
}
