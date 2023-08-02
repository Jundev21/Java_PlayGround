package Java_School_Project;

public class PassEvaluation implements GradeEvaluation {
    @Override
    public String getGrade(int point) {
        if (point >= 70)
            return "P";
        else
            return "F";
    }
}
