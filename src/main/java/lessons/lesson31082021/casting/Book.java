package lessons.lesson31082021.casting;

import java.util.Date;

public class Book {
}

class ProgrammerBook extends Book {
}

class BookInspector {
    public static void main(String[] args) {
        Book book = new ProgrammerBook();
        ProgrammerBook progrBook = new ProgrammerBook();

        Book goodBook = progrBook;// new ProgrammerBook();
        ProgrammerBook goodProgrBook = (ProgrammerBook) book;

        Book simpleBook = new Book();
        if (simpleBook instanceof ProgrammerBook) {
            ProgrammerBook simpleProgrBook = (ProgrammerBook) simpleBook;//error
        }
//        Date date = (Date) simpleBook;
    }
}

