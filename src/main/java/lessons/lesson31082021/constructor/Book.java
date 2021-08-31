package lessons.lesson31082021.constructor;

public class Book {

    private String nameOfBook;

    public Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public Book() {
        System.out.println("I am a constructor without variables");
    }

    protected void doSomething() {
        System.out.println("I am doing something from Parent class");
    }
}
