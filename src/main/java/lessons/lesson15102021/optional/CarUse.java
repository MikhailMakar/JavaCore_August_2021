package lessons.lesson15102021.optional;

import java.util.Optional;

public class CarUse {

    public static void main(String[] args) {
//        Car car = new Car();
//        Car car1 = new Car(new Engine());
//        Car car2 = new Car(new Engine(new Oil()));

//        checkCarDetailsOldStyle(new Car(null));

        checkCarDetailsNewStyle(new Car(new Engine()));
    }

    private static void checkCarDetailsOldStyle(Car car) {
        if (car == null) {
            throw new RuntimeException("Dude, where is your car?!");
        }

        Engine engine = car.getEngine();

        if (engine == null) {
            throw new RuntimeException("Car without engine");
        }

        Oil oil = engine.getOil();

        if (oil == null) {
            throw new RuntimeException("Oil is absent");
        }

        String brand = oil.getBrand();

        if (brand == null || brand.isEmpty()) {
            System.out.println("there is no name for brand");
        }
    }

    private static void checkCarDetailsNewStyle(Car car) {
//        Optional<Car> car1 = Optional.of(car);
        Optional<Car> optionalCar = Optional.ofNullable(car);

        Optional<Engine> optionalEngine = optionalCar.map(c -> c.getEngine());

//        Engine no_engine = optionalEngine.orElseThrow(() -> new RuntimeException("No engine"));
//
//        Engine engine = new Engine();
//
//        if (optionalEngine != null && optionalEngine.isPresent()) {
//            engine = optionalEngine.get();
//        }

//        optionalEngine.ifPresent(e -> System.out.println(e));
//        optionalEngine.ifPresentOrElse(
//                System.out::println,
//                () -> System.out.println("No engine;")
//        );

        Optional<Oil> oilOptional = optionalEngine.map(e -> e.getOil());

        Oil oil = oilOptional.orElse(getOil());
        System.out.println(oil);
    }

    private static Oil getOil() {
        System.out.println("Inside of getOil method");
        return new Oil("Shell");
    }

    private static Optional<Car> getCar(int value) {
        switch (value) {
            case 1:
                return Optional.of(new Car());
            case 2:
                return Optional.of(new Car(new Engine()));
            default:
                return Optional.empty();
        }
    }
}
