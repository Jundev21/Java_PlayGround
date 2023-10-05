package Java_School_Project;

import java.util.ArrayList;
import java.util.Objects;

public class Student {

    private int studentId;
    private String studentName;
    private ArrayList<Score> scoreList;
    private String studentMajor;
    private final Subject majorSubject;

    public Student(int studentId, String studentName, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    public void addSubjectScore(Score score) {
        scoreList.add(score);
    }

    public int getStudentId() {
        return studentId;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }
}