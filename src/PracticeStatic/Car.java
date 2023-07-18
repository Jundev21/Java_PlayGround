package PracticeStatic;

public class Car{


    // static 은 인스터스 생성안하고 바로 메모리상에 올라가기때문에
    // 값은 항상 정해져있다.
    static private int carNumber = 1001;

    // 멤버변수는 인스턴스가 생성될때마다 지정되는부분
    int currCarNum =0;

    Car(){
        currCarNum = 0;
    }

    public void getCarNum(){

        currCarNum = carNumber;
        carNumber+=1;

        System.out.println(currCarNum);

    }

}
