package Java_School_Project;

public class Score {
    private int studentId;
    private int score;

    Subject subject;


    public Score(Subject subject, int studentId, int score) {
        this.subject = subject;
        this.studentId = studentId;
        this.score = score;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
