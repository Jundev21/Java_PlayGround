package Interface_Practice;


// 인터페이스를 왜 사용하는것인가?
// 인터페이스가 하는

public class Interface_Main {

    public static void main(String[] args) {


        // Calc 타입임으로 Calc 타입에 있는 메서드만 사용가능

        Calc calc = new CompleteCalc();

        int result = calc.add(1,2);

        CompleteCalc a = new CompleteCalc();

        a.showInfo();

    }
}
