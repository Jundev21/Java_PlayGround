package Thread.executor;

import java.util.concurrent.*;

import static Thread.executor.ExecutorUtils.printState;
import static Thread.executor.ExecutorUtils.printStateName;
import static java.lang.Thread.sleep;

public class PoolSizeMainV2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("pool 생성");
        printState(es);

        for(int i=0;i<10;i++){
            es.execute(new RunnableTask("task"+i));
            printStateName(es,"task"+i);
        }

        es.close();
    }
}
