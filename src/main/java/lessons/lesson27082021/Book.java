package lessons.lesson27082021;

public class Book {

    private int price;

    public Book() {
        this(34);
    }

    public Book(int price) {
        this.price = price;
    }

    public static void printSomething(String s) {
        System.out.println(s);
    }

    public void printSomething(String s, int n) {
        System.out.println(s + n);
    }


    public static void main(String[] args) {
        Book book = new Book(12);
        System.out.println(book.price);
        Book book1 = new Book();
        System.out.println(book1.price);
        printSomething("Hello!");
    }
}
