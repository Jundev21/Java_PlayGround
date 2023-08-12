package generic_practice.rectangle;

public class CalcRecTangle {


    public <T,V> double getCalc(Point<T,V> a, Point<T,V> b ){

        double left = ((Number) a.getX()).doubleValue();
        double right = ((Number) b.getX()).doubleValue();
        double top = ((Number) a.getY()).doubleValue();
        double bottom = ((Number) b.getY()).doubleValue();


        double width = right - left;
        double height = top - bottom;

        return width * bottom;


    }





}
