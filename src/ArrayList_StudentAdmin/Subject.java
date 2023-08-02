package ArrayList_StudentAdmin;

public class Subject {

    String className;
    int classScore;

    Subject(String className, int classScore){
        this.classScore = classScore;
        this.className = className;

    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {


        this.className = className;

        // 연산자 비트 부호 계산하는법
        // 맨앞

    }

    public int getClassScore() {
        return classScore;
    }

    public void setClassScore(int classScore) {
        this.classScore = classScore;
    }
}
