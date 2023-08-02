package Thread_Practice.miniProject;


// 해당 도서관에는 대여하는 책들이 나열되어있다.
// 책 추가, 대여, 반납 매서드 구현되어있다.

import java.util.ArrayList;

public class Library {

    ArrayList<String> books;


    public Library(){
        books = new ArrayList<>();
        books.add("지구과학1");
        books.add("지구과학2");
        books.add("지구과학3");
        books.add("지구과학4");
    }


    public void addBook(String newBook){

        books.add(newBook);

    }

    public synchronized String lendBook() throws InterruptedException {

        Thread t = Thread.currentThread();

        if( books.size() == 0){

            System.out.println(t.getName() + "start wait");
            wait();
            System.out.println(t.getName() +"end wait");
        }

        String book = books.remove(0);

        System.out.println(t.getName() + ": " + book + " lend");

        return book;
    }


    public synchronized void returnBook(String book){

        Thread t = Thread.currentThread();

        books.add(book);
        notify();
        System.out.println(t.getName() + ": " + book + " return");

    }




}
