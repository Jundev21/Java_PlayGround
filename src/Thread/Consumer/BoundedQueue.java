package Thread.Consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BoundedQueue implements Buffer{

    private BlockingQueue<String> queue;

    public BoundedQueue(int max) {
        this.queue = new ArrayBlockingQueue<>(max) ;
    }

    @Override
    public void put(String value) throws InterruptedException {
        try {
            // 대기시간설정가능
            this.queue.put(value);
        }catch (InterruptedException e){
            throw new InterruptedException();
        }
    }

    @Override
    public String take() throws InterruptedException {
        try{
            // 대기시간설정가능
            return this.queue.take();
        }catch (InterruptedException e){
            throw new InterruptedException();
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
