package Java_School_Project;


// 성적 평가도 인터페이스는 설계도면 이라고 볼 수 있다.
// 클래스를 일반 과목 클래스, 전공과목 클래스로 나눠서 작성해야한다.
public interface GradeEvaluation {

    public String getGrade(int point);

}
