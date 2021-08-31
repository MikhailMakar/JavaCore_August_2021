package lessons.lesson31082021.constructor;

public class ProgrammerBook extends Book {

    private String nameOfProgrammerBook;

    public ProgrammerBook(String nameOfProgrammerBook) {
//        super("Cat in the boots");
        this.nameOfProgrammerBook = nameOfProgrammerBook;
    }

    public static void main(String[] args) {
        ProgrammerBook programmerBook = new ProgrammerBook("Java 8");
        System.out.println(programmerBook);
        programmerBook.doSomething();
    }

    @Override
    protected void doSomething() {
//        super.doSomething();
        System.out.println("I am doing something from child class");
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "nameOfProgrammerBook='" + nameOfProgrammerBook + '\'' +
                '}';
    }
}
