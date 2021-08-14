package lessons.lesson13082021.other2;

import java.time.LocalDate;

public class TestMain {

    public LocalDate localDate;

    public TestMain(LocalDate localDate) {
        this.localDate = localDate;
    }

    protected LocalDate getLocalDate() {
        return localDate;
    }
}
