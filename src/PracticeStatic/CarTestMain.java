package PracticeStatic;

public class CarTestMain {

    public static void main(String[] args) {


        CarFactory factory = CarFactory.getInstance();

        CarFactory factory2 = CarFactory.getInstance();


        Car sonata = factory.createCar();

        Car santaFe = factory.createCar();

        sonata.getCarNum();

        santaFe.getCarNum();



    }
}
