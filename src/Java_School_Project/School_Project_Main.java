package Java_School_Project;

public class School_Project_Main {

    //학교 싱글턴으로 생성
    AdminControl seoulSchool = AdminControl.getInstance();
    // 과목생성
    Subject korean;
    Subject math;
    Subject dance;
    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {

        School_Project_Main test = new School_Project_Main();
        test.createSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);

    }

    public void createSubject(){

        korean = new Subject(Define.KOREAN, "Korean");
        math = new Subject(Define.MATH, "Math");
        dance = new Subject(Define.DANCE, "Dance");

        seoulSchool.addSubjectsList(korean);
        seoulSchool.addSubjectsList(math);
        seoulSchool.addSubjectsList(dance);
    }

    public void createStudent(){

        Student std1 = new Student(21312, "kim", korean);
        Student std2 = new Student(21313, "lee", math);
        Student std3 = new Student(21314, "oh", korean);
        Student std4 = new Student(21315, "park", korean);
        Student std5 = new Student(21316, "lim", math);
        Student std6 = new Student(21317, "cho", dance);
        Student std7 = new Student(21317, "sim", dance);

        seoulSchool.addStudentList(std1);
        seoulSchool.addStudentList(std2);
        seoulSchool.addStudentList(std3);
        seoulSchool.addStudentList(std4);
        seoulSchool.addStudentList(std5);
        seoulSchool.addStudentList(std6);
        seoulSchool.addStudentList(std7);

        korean.resister(std1);
        korean.resister(std2);
        korean.resister(std3);
        korean.resister(std4);
        korean.resister(std5);

        math.resister(std1);
        math.resister(std2);
        math.resister(std3);
        math.resister(std4);
        math.resister(std5);

        dance.resister(std1);
        dance.resister(std2);
        dance.resister(std3);

        addScore(std1, korean,95);
        addScore(std1, math,56);

        addScore(std2, korean,95);
        addScore(std2, math,95);

        addScore(std3, korean,100);
        addScore(std3, math,88);

        addScore(std4, korean,89);
        addScore(std4, math,95);

        addScore(std5, korean,85);
        addScore(std5, math,56);

        addScore(std6, dance, 80);
        addScore(std7, dance, 60);

        addScore(std1, dance, 95);
        addScore(std2, dance, 85);
        addScore(std3, dance, 55);

    }

    public void addScore(Student student, Subject subject, int point){

        Score score = new Score(subject, student.getStudentId(), point);
        student.addSubjectScore(score);


    }


}
