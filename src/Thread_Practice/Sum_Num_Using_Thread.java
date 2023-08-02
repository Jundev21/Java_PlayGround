package Thread_Practice;


// 두개의 thread 를 사용하여 하나의 스레드는 1부터 50을 나머지 하나는 51부터 100을 더하는 클래스
// 하나의 스레드가 다른 스레드를 join하여 Non-Runnalbe 상태로만들고 스레드가 끝날때 다시 run 으로 실핸된다.
//
public class Sum_Num_Using_Thread extends Thread{

    int start;
    int end;
    int result;


    public Sum_Num_Using_Thread(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run() {

        result = start + end;

    }
}

