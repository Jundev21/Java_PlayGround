package Java_School_Project;

import java.util.ArrayList;

public class GenerateGradeReport {

    AdminControl school = AdminControl.getInstance();

    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER = " 이름  |  학번  | 중점과목 | 점수   \n";
    public static final String LINE = "=====================================\n";

    // 스트링대신 스트링 버퍼를 사용하여 메모리 누수를 막는다.
    private final StringBuffer buffer = new StringBuffer();

    // 모든 과목에 대한 학점 산출
    public String getReport() {

        ArrayList<Subject> subjectList = school.getSubjectsList();

        for (Subject subject : subjectList) {
            makeHeader(subject);
            makeBody(subject);
        }

        return buffer.toString();

    }


    public void makeHeader(Subject subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }

    public void makeBody(Subject subject) {

        ArrayList<Student> studentsList = subject.getStudentList();


        for (Student s : studentsList) {

            buffer.append(s.getStudentName());
            buffer.append(" | ");
            buffer.append(s.getStudentId());
            buffer.append(" | ");
            buffer.append(s.getMajorSubject().getSubjectName());
            buffer.append(" | ");

            getScoreGrade(s, subject.getSubjectId());
            buffer.append("\n");
//            buffer.append(LINE);


        }

//        buffer.append(GenerateGradeReport.LINE);


    }


    // 국어 듣는 학생들의 전공수업을 따진다. 만약 전공수업이 국어라고하면 점수가 바뀐다.
    private void getScoreGrade(Student s, int subjectId) {

        ArrayList<Score> scoreList = s.getScoreList();

        //점수 평가하는 부분 전공인지 아닌지에 따라 두개로 나뉜다

        GradeEvaluation[] getGrade = {new BasicEvaluation(), new MajorEvaluation(), new PassEvaluation()};

        for (Score getScore : scoreList) {

            if (getScore.getSubject().getSubjectId() == subjectId) {

                String grade;

                buffer.append(getScore.getScore());
                buffer.append(":");


                if (subjectId == Define.DANCE) {

                    grade = getGrade[Define.PF_TYPE].getGrade(getScore.getScore());
                } else if (s.getMajorSubject().getSubjectId() == subjectId) {

                    grade = getGrade[Define.SAB_TYPE].getGrade(getScore.getScore());

                } else {

                    grade = getGrade[Define.AB_TYPE].getGrade(getScore.getScore());

                }

                buffer.append(grade);

                buffer.append(" | ");

            }
        }
    }
}
