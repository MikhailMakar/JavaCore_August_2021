package lessons.lesson15102021.optional;

public class Engine {

    private Oil oil;

    public Engine() {
    }

    public Engine(Oil oil) {
        this.oil = oil;
    }

//    public Optional<Oil> getOptionalOil() {
//        return Optional.ofNullable(oil);
//    }

    public Oil getOil() {
        return oil;
    }
    public void setOil(Oil oil) {
        this.oil = oil;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "oil=" + oil +
                '}';
    }
}
