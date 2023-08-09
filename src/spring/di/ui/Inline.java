package spring.di.ui;

import spring.di.entity.Exam;

public class Inline implements ExamPrint{

    public Exam exam;

    public Inline(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {

        System.out.println("total is " + exam.total() + " avg is " + exam.avg() + "\n");
    }
}
