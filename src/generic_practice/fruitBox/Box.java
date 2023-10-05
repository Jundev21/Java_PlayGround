package generic_practice.fruitBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    public List<T> box = new ArrayList<T>();

    void add(T item){
        box.add(item);
    }
    T get(int i){
        return box.get(i);
    }
    int size(){
        return box.size();
    }
    public String toString(){
        return box.toString();
    }
}
