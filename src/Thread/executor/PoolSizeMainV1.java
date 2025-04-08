package Thread.executor;

import java.util.Objects;
import java.util.concurrent.*;

import static Thread.executor.ExecutorUtils.printState;
import static Thread.executor.ExecutorUtils.printStateName;
import static java.lang.Thread.sleep;

public class PoolSizeMainV1 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        ExecutorService es = new ThreadPoolExecutor(2, 4, 3000, TimeUnit.MILLISECONDS, workQueue);

        printState(es);

        es.execute(new RunnableTask("task1"));
        printStateName(es,"task1");

        es.execute(new RunnableTask("task2"));
        printStateName(es,"task2");

        es.execute(new RunnableTask("task3"));
        printStateName(es,"task3");

        es.execute(new RunnableTask("task4"));
        printStateName(es,"task4");

        es.execute(new RunnableTask("task5"));
        printStateName(es,"task5");

        es.execute(new RunnableTask("task6"));
        printStateName(es,"task6");

        try {
            es.execute(new RunnableTask("task7"));
        }catch (RejectedExecutionException e){
            System.out.println("task7 실행 거절");
        }

        sleep(3000);
        System.out.println("작업 수행 완료");
        printStateName(es,"task7");
    }
}
