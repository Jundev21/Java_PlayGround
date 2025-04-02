package Thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static Thread.executor.ExecutorUtils.printState;

public class ExecutorBasicMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(2, 2, 0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        System.out.println("== 초기 상태 ==");
        printState(executorService);
        executorService.execute(new RunnableTask("taskA"));
        executorService.execute(new RunnableTask("taskB"));
        executorService.execute(new RunnableTask("taskC"));
        executorService.execute(new RunnableTask("taskD"));
        System.out.println("== 작업 완료 ==");
        printState(executorService);

        Thread.sleep(3000);
        System.out.println("스레드 종료");
        printState(executorService);
        executorService.close();
        System.out.println("스레드 전체 종료");
        printState(executorService);
    }
}


