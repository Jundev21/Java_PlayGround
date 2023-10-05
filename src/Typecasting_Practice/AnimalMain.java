package Typecasting_Practice;

public class AnimalMain {

    public static void main(String[] args) {

        Animal a = new Dog();
        Animal b = new Cat();


        ((Cat)b).night();


    }

}
