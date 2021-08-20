package lessons.lesson20082021;

import java.util.Objects;

public class Cat {

    private int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public static void main(String[] args) {
        Cat barsik = new Cat(2, "Barsik");
        Cat theSameBarsik = barsik;
        System.out.println(barsik.equals(theSameBarsik));
        Cat anotherCat = new Cat(3, "Murka");
        System.out.println(barsik.equals(anotherCat));
    }
}
