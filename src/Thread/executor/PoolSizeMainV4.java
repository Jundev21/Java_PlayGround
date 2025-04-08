package Thread.executor;

import java.util.concurrent.*;

import static Thread.executor.ExecutorUtils.printState;

public class PoolSizeMainV4 {

//    static final int TASK_SIZE = 1100;
//    static final int TASK_SIZE = 1200;
    static final int TASK_SIZE = 1201;


    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = new ThreadPoolExecutor(100, 200, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        printState(es);

        long startMs = System.currentTimeMillis();

        for(int i=0;i<TASK_SIZE;i++){
           String taskName = "task" + i;
           try{
               es.execute(new RunnableTask(taskName));
               printState(es);
           }catch (RejectedExecutionException e){
               System.out.println(taskName + " " + e);
           }
        }

        es.close();
        long endMs = System.currentTimeMillis();
        System.out.println("time: " + (endMs - startMs));
    }
}
