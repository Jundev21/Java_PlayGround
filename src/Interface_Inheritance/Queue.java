package Interface_Inheritance;

public interface Queue {

    //책이 들어가는것
    void enQueue(String title);
    //책 빼는것
    String deQueue();
    int getSize();

}
