package lessons.lesson15102021;

import java.util.Objects;

public class Processor {

    private String processor;

    public Processor(String processor) {
        this.processor = processor;
    }

    public String getProcessorName() {
        return processor;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "processor='" + processor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor1 = (Processor) o;
        return Objects.equals(processor, processor1.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor);
    }

}
