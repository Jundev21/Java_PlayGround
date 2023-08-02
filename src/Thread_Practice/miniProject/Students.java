package Thread_Practice.miniProject;

// 학생 클래스가 생성되어있고 스레드 담당되어있다.
public class Students extends Thread{


    @Override
    public void run() {

        String title = null;
        try {
            title = Mini_Project_Main.MainLibrary.lendBook();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Mini_Project_Main.MainLibrary.returnBook(title);

    }
}
