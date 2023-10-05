package Thread_Practice;

public class API08 {
    public static void main(String[] args) {

        Thread t1 = Thread.currentThread();

        System.out.println(t1.getName());

        t1.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());

        Runnable traget;


        try{

            for( int i=1; i<=100; i++){

                System.out.println(i);

                Thread.sleep(1000);
            }
        }catch (Exception e){

            e.printStackTrace();


        }

        System.out.println();
    }
}
