package spring.di.ui;

import spring.di.entity.Exam;

public class Grid implements ExamPrint {


    Exam exam;

    public Grid(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.println("Total" + "\n");
        System.out.println(exam.total() + "\n");
        System.out.println("Avrage"+ "\n");
        System.out.println(exam.avg()+ "\n");

    }
}
