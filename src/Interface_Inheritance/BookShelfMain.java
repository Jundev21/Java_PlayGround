package Interface_Inheritance;

public class BookShelfMain {

    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("토지 1");
        bookQueue.enQueue("토지 2");
        bookQueue.enQueue("토지 3");
        bookQueue.enQueue("토지 4");
        bookQueue.enQueue("토지 5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());

    }
}
