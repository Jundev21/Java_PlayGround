package Thread.executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

//직접 생성 하지않도록 abstract 를 사용함 .
public abstract class ExecutorUtils {
    public static void printState(ExecutorService executor) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
        if(executor instanceof ThreadPoolExecutor poolExecutor){
            int pool = poolExecutor.getPoolSize();
            int active = poolExecutor.getActiveCount();
            int queued = poolExecutor.getQueue().size();
            long completedTask = poolExecutor.getCompletedTaskCount();
            System.out.println("[pool=" + pool + ", active=" + active + ", queued=" + queued + ", completedTask=" + completedTask + "]");
            System.out.println("completedTask = " + completedTask);
        }else{
            System.out.println("executor = " + executor);
        }
    }

    public static void printStateName(ExecutorService executor, String name) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
        if(executor instanceof ThreadPoolExecutor poolExecutor){
            int pool = poolExecutor.getPoolSize();
            int active = poolExecutor.getActiveCount();
            int queued = poolExecutor.getQueue().size();
            long completedTask = poolExecutor.getCompletedTaskCount();
            System.out.println("[pool=" + pool + ", active=" + active + ", queued=" + queued + ", completedTask=" + completedTask + "]");
            System.out.println("completedTask = " + completedTask);
            System.out.println("completedTaskName = " + name);
        }else{
            System.out.println("executor = " + executor);
        }
    }
}
