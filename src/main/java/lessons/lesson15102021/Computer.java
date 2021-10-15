package lessons.lesson15102021;

import java.util.Objects;

public class Computer {

    private Processor processor;

    public Computer(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                '}';
    }

    public Processor getProcessor() {
        return processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor);
    }
}
