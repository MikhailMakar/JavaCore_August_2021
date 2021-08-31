package lessons.lesson31082021;

import java.util.Collections;
import java.util.List;

public final class ImmutableClassExample {

    private final String name;
    private final int age;
    private final List<Integer> skills;

    public ImmutableClassExample(String name, int age, List<Integer> skills) {
        this.name = name;
        this.age = age;
        this.skills = Collections.unmodifiableList(skills);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getSkills() {
        return skills;
    }
}
