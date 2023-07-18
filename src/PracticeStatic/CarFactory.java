package PracticeStatic;

public class CarFactory {

    static private CarFactory carFactory = new CarFactory();

    static public CarFactory getInstance() {

        if (carFactory == null) carFactory = new CarFactory();

        return carFactory;

    }

    public Car createCar(){

        Car makeNewCar = new Car();


        return makeNewCar;


    }


}
