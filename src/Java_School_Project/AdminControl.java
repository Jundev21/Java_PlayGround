package Java_School_Project;

import java.util.ArrayList;

public class AdminControl {


    //싱글톤 생성
    private static AdminControl school = new AdminControl();
    private static String school_name = "top school";
    private final ArrayList<Student> studentList = new ArrayList<>();
    private final ArrayList<Subject> subjectsList = new ArrayList<>();
    private AdminControl(){

    }
    public static AdminControl getInstance(){

        if(school == null) return new AdminControl();

        return school;
    }

    public void addSubjectsList(Subject subj) {
        subjectsList.add(subj);
    }

    public void addStudentList(Student std) {
        studentList.add(std);
    }

    public static AdminControl getSchool() {
        return school;
    }

    public static void setSchool(AdminControl school) {
        AdminControl.school = school;
    }

    public static String getSchool_name() {
        return school_name;
    }

    public static void setSchool_name(String school_name) {
        AdminControl.school_name = school_name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Subject> getSubjectsList() {
        return subjectsList;
    }

}
