package Thread.Consumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueBuffer implements Buffer {
    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    /*
    Object.wait()
    - 현제 스레드 가진 락 반납 하고 waiting
    현재 스레드 waiting
    이 메서드는 syncronized를 사용한 곳에서 락을 소유하고있을때만 호출 가능.
    호출한 스레드 락 반납하고 다른 스레드가 락획득후 실행
    notify 또는 notifyAll 호출할때까지 대기상태 유지

    Object.notify()
    대기중인 스레드중 하나깨움
    Syncronized 블록이나 메서드에서 호출되어야한다. 깨운 스레드는 락을 획득할 기회 얻는다.
    대기중인 스레드가 여러개면 그 중에 하나만 깨운다.
    notifyAll
    모든 스레드 깨운다.
    Object.wait(), notify() - 같은 스레드에있는 오브젝트만 재우고 깨울수있다....
    notify() 를 할때 원하는 상대를 지정해서 깨우면

    스레드 기아
    notify() 는 랜덤으로 깨우기때문에 정작 필요한 스레드는 꺠우지않고 계속해서 불필요한 스레드만 깨울 수 있다.
    */

    public QueueBuffer(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String value) throws InterruptedException {
        while (queue.size() == max) {
            System.out.println("큐가 가득참, 추가 대기");
            try{
                wait(); // Runnable 에서 waiting 으로 변경되고 락을 반납한다. 대기상태로 빠짐.
                System.out.println("[put] 생잔자 깨어남");
            } catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(value);
        System.out.println("[put] 생산자 데이터 저장, notify() 호출");
        notify();
    }

    @Override
    public synchronized String take() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("큐가 없음, 소비 대기");
            try{
                wait(); // Runnable 에서 waiting 으로 변경되고 락을 반납한다. 대기상태로 빠짐.
                System.out.println("[put] 소비자 깨어남");
            } catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        String data = queue.poll();
        notify();
        return data;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}