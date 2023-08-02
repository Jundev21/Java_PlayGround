package ArrayList_StudentAdmin;

import java.util.ArrayList;

public class Student {

    static private int globalStudentId = 1001;
    String name;
    int totalScore;

    int studentId;

    ArrayList<Subject> classes;

    Student(String name) {

        this.name = name;
        studentId = globalStudentId;
        globalStudentId += 1;
        classes = new ArrayList<>();

    }

    public void getClass(String className, int classScore) {

        Subject newClass = new Subject(className, classScore);

        classes.add(newClass);

    }

    public void classInfo() {

        for (Subject getClass : classes) {

            System.out.println(name + " 학생 번호는 " + studentId + " 이며 " + getClass.className + " 을 수강중이며 " + getClass.classScore + " 의 점수를 맞았다");

        }

    }

    public void findTotalScore() {

        for (Subject getClass : classes) {

            totalScore += getClass.classScore;
        }

        System.out.println(name + "학생의 총 점수는 " +  totalScore);

    }


}
