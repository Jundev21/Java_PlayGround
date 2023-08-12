package generic_practice.rectangle;

public class Rectangle_Main {
    public static void main(String[] args) {


        Point<Double,Integer> firstPoint = new Point<>(0.0, 0);
        Point<Double,Integer> secondPoint = new Point<>(10.0, 10);

        CalcRecTangle calc = new CalcRecTangle();

        System.out.println(calc.<Double,Integer>getCalc(firstPoint,secondPoint));


    }
}
