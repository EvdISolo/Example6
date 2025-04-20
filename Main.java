
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Война и мир", 1869, "Лев Толстой", 1000);
        Author author = new Author("Лев", "Толстой", 9);

        System.out.println(book.isBig());
        System.out.println(book.estimatePrice());
        System.out.println(book.matches("Лев"));

    }
}