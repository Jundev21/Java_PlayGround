package Logger_Practice;

//java.lang.IllegalArgumentException은 적합하지 않거나(illegal) 적절하지 못한(inappropriate) 인자를 메소드에 넘겨주었을 때 발생한다

public class StudentNameFormatException extends IllegalArgumentException{
    public StudentNameFormatException(String errorMessage){
        super(errorMessage);
    }
}