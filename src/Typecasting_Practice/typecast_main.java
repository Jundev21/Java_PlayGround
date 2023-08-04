package Typecasting_Practice;


// 다형성
// 형변환 - 업캐스팅, 다운캐스팅
// 부모 클래스는 자손의 클래스의 속성을 갖고있지않지만
// 자손 클래스는 부모클래스 속성을 갖고있다.
// 참조변수의 형변환은 사용할 수 있는 멤버의 갯수를 조절
// 다운 캐스팅을 사용하는 이유는 업 캐스팅이 된 클래스에서 자손 클래스 멤버를 사용하기 위해 다운캐스팅을 사용한다.


class Car {

    public void drive(){
        System.out.println("driving");
    }

    public void stop(){
        System.out.println("stop");
    }


}

class police_car extends Car{

    public void light(){
        System.out.println("red, blue");
    }
}

class firefighter extends Car{

    public void water(){
        System.out.println("fire water");
    }

}


public class typecast_main {
    public static void main(String[] args) {

        Car car = new police_car();
        Car car2 = null;

        police_car police = (police_car) new Car();

        car.drive();

        police.light();


    }
}
