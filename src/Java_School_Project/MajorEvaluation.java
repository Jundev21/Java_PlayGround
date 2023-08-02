package Java_School_Project;

public class MajorEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {
        String resultGrade;

        if(point >=95 && point <=100)
            resultGrade = "S";
        else if(point >=90 && point <=94)
            resultGrade = "A";
        else if(point >=80 && point <=89)
            resultGrade = "B";
        else if(point >=70 && point <=79)
            resultGrade = "C";
        else if(point >=60 && point <=69)
            resultGrade = "D";
        else
            resultGrade = "F";

        return resultGrade;
    }
}
