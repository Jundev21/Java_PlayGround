package Thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static Thread.executor.ExecutorUtils.printState;
import static Thread.executor.ExecutorUtils.printStateName;

public class PoolSizeMainV3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();

        System.out.println("pool 생성");
        printState(es);

        for(int i=1; i<=10;i++){
            String taskName = "task" +i;
            es.execute(new RunnableTask(taskName));
            printState(es);
        }
        es.close();
    }
}
