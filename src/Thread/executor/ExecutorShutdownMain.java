package Thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorShutdownMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new RunnableTask("taskA"));
        executorService.execute(new RunnableTask("taskB"));
        executorService.execute(new RunnableTask("taskC"));
        executorService.execute(new RunnableTask("logTask",100_000));
        ExecutorUtils.printState(executorService);
        System.out.println("shutdown 시작");
        shutdownAndAwaitTermination(executorService);
        System.out.println("shutdown 완료");
        ExecutorUtils.printState(executorService);
    }

    private static void shutdownAndAwaitTermination(ExecutorService es) {
        es.shutdown(); //non-blocking 새로운 작업 받지 않는다. 처리중, 큐에 이미대기중인 작업은 종료
        //이미 대기중인 작업들을 모두 완료할때까지 10초 기다린다.
        try {
            if(!es.awaitTermination(10, TimeUnit.SECONDS)){
                // 정상 종료가 너무 오래걸리면
                System.out.println("서비스 정상 종료 실패 -> 강제 종료 시도");
                es.shutdownNow();
                // 작업 취소될때까지 대기
                if(!es.awaitTermination(10, TimeUnit.SECONDS)){
                    System.out.println("서비스 종료되지 않았습니다.");
                }
            }
        } catch (InterruptedException e) {
            es.shutdownNow();
        }
    }
}
