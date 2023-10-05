package generic_practice.fruitBox;



// 하나의 박스 클래스에 여러타입의 과일이 들어와서 담겨질 수 있다.
public class FruitMain {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();

        Box<Toy> toxBox = new Box<>();

        Box<Grape> grapeBox = new Box<>();

        Box<Fruit> fruitBox = new Box<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        System.out.println(fruitBox);

    }
}
