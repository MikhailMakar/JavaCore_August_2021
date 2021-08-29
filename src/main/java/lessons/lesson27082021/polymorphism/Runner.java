package lessons.lesson27082021.polymorphism;

public class Runner {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.print();
        shape = new Square();
        shape.print();
        shape = new Triangle();
        shape.print();
    }
}
