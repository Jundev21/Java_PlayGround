package Thread.Consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockQueueBuffer implements Buffer {

    private final Lock lock = new ReentrantLock();
    private final Condition waitList = lock.newCondition();
    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public LockQueueBuffer(int max) {
        this.max = max;
    }

    @Override
    public void put(String value) throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == max) {
                System.out.println("큐가 가득참, 추가 대기");
                try {
                    waitList.await();
                    System.out.println("[put] 생잔자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.offer(value);
            System.out.println("[put] 생산자 데이터 저장, notify() 호출");
            waitList.signal();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String take() throws InterruptedException {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                System.out.println("큐가 없음, 소비 대기");
                try {
                    waitList.await();
                    System.out.println("[put] 소비자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            String data = queue.poll();
            waitList.signal();
            return data;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}