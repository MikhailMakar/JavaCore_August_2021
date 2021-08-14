package lessons.lesson13082021;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Whale");
        System.out.println(animal.getName());

        System.out.println(new Main().getI());

        for (String s: args) {
            System.out.println(s);
        }
    }
}
