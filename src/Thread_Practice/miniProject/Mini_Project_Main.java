package Thread_Practice.miniProject;




// 스레드 미니 프로젝트
// 도서관에 책을 대여하려는 학생들이 줄을 서있다.
// 순서대로 책을 대여를 하고 모든 책이 대여가 완료되었을때 남은 학생들은 반납이 될때까지 기다린다.
// 반납이 될때마다 대여를 기다리는 학생들은 순서대로 대여를 이어간다.
// 쓰레드와 동기화 notify, wait 를 사용해서 프로그램을 작성한다.
public class Mini_Project_Main {

    public static Library MainLibrary = new Library();
    public static void main(String[] args) {


        Students std1 = new Students();
        Students std2 = new Students();
        Students std3 = new Students();
        Students std4 = new Students();
        Students std5 = new Students();
        Students std6 = new Students();

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();

    }
}
