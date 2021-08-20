package lessons.lesson20082021;

public final class ImmutableClass {

    private final String name;

    public ImmutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return new String(name);
    }
}
