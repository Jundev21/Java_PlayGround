package Stream_Practice;

public class Customer {

    private final String name;
    private final int age;
    private final int price;

    Customer(String name, int age, int price){
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
