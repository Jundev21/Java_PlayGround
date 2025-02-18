package Thread.Consumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueBuffer implements Buffer {

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public QueueBuffer(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String value) {
        if(queue.size() == max) {
            System.out.println("큐가 가득참, 데이터 버려짐");
            return;
        }
        queue.offer(value);
    }

    @Override
    public synchronized String take() {
        if(queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
