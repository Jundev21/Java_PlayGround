package Interface_Practice;


// 타입을 상속받았다.
public class CompleteCalc extends Calculator{
    @Override
    public int times(int num1, int num2) {

        return num1 * num2;

    }

    @Override
    public int divide(int num1, int num2) {

        if(num2 == 0) return ERROR;
        return num1 / num2;

    }

    public void showInfo(){

        System.out.println("complete impliments");

    }
}
