package Java_School_Project;

public class BasicEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {

        String resultGrade;

        if(point >=90 && point <=100)
            resultGrade = "A";
        else if(point >=80 && point <=89)
            resultGrade = "B";
        else if(point >=70 && point <=79)
            resultGrade = "C";
        else if(point >=55 && point <=69)
            resultGrade = "D";
        else
            resultGrade = "F";



        return resultGrade;

    }
}
