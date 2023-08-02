package Logger_Practice;



// 로그 예시
// 학생이름들을 남기는데 만약 학생이름에 오류가 있을 경우에는 로그를 남긴다.


public class Logger_Main {

    public static void main(String[] args) {

        MyLogger myLogger = MyLogger.getLogger();
//
//		  myLogger.log("test");

        Student student1 = new Student("Jason");

        try {
            Student student2 = new Student("my name is jason two");
            student2.getStudentName();
        } catch (StudentNameFormatException e) {

            System.out.println(e);

            myLogger.warning(e.getMessage());
        }

        student1.getStudentName();

//        student1.getStudentName();
//        student2.getStudentName();

    }

}
