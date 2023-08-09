package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamPrint;
import spring.di.ui.Grid;
import spring.di.ui.Inline;


//bean 은 지시서

public class Spring_main {
    public static void main(String[] args) {

//      Exam 인터페이스 NewlecExam 구현객체
        Exam exam = new NewlecExam();

        // exam 이 di 이다 갈아서 교체하는것 부분만 바꾸는 것이 DI injection , spring 이 없을경우에는 개인적인 설정으로 따로 빼서 작성해야하는데 매우 번거로운일이니 이러한 이유때문에 프레임워크인 스프링을 사용한다.
        ExamPrint printData = new Inline(exam);
        ExamPrint printDataGrid = new Grid(exam);
        printDataGrid.print();


        // 데이터를 갖고있는 entity
    }
}
