package Thread_Practice;


// 자바에서 thread 만드는 방법 두가지가있다.
// 1. thread 클래스를 상속받아서 사용하는 방법
// 2. runnable implements 하는방법


public class Thread_Main {
    public static void main(String[] args) throws InterruptedException {

        Sum_Num_Using_Thread sum1 = new Sum_Num_Using_Thread(1,2);
        Sum_Num_Using_Thread sum2 = new Sum_Num_Using_Thread(51,100);

        sum1.start();
        sum2.start();

        sum1.join();
        sum2.join();


        int latTotal = sum1.result + sum2.result;

        System.out.println("total sum1 is " +  sum1.result);
        System.out.println( "total sum2 is "  + sum2.result);
        System.out.println("last total " + latTotal);




    }


}
