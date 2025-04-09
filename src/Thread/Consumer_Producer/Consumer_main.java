package Thread.Consumer_Producer;


// 생산자 소비자 문제
// 생산자와 버퍼 소비자가 필요
// 버퍼는 데이터를 저장하는곳
// 생산자 데이터 제공
// 소비자는 여러 스레드가 일 처리 하는것


// 메인스레드에서 데이터를 추가하고
// 버퍼에 있는 데이터들을 스레드가 꺼내서 사용한다.


import java.util.LinkedList;
import java.util.List;

public class Consumer_main {

    public static void main(String[] args) {
        Imple_buffer imple_buffer = new Imple_buffer(2);
        producerFirst(imple_buffer);
    }

    private static void printAllListState(List<Thread> threadList) {
        System.out.println("프린트 스레드 리스트");
        for (Thread thread : threadList) {
            System.out.println("스레드 리스트 출력 " + thread.toString());
        }
    }

    private static void startListProducer(Imple_buffer imple_buffer) {
        System.out.println("생산자 스레드 시작");
        List<Thread> producerThreadList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Producer_thread(imple_buffer, i + " data"),"producer thread " + i);
            producerThreadList.add(thread);
            thread.start();
            printAllListState(producerThreadList);
        }
    }

    private static void startListConsumer(Imple_buffer imple_buffer) {
        System.out.println("소비자 스레드 시작");
        List<Thread> consumerThreadList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Consumer_thread(imple_buffer, i + " data"),"consumer thread " + i);
            consumerThreadList.add(thread);
            thread.start();

            try{

                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            printAllListState(consumerThreadList);
        }
    }

    private static void producerFirst(Imple_buffer imple_buffer) {
        startListProducer(imple_buffer);
        startListConsumer(imple_buffer);

    }

}
