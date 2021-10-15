package lessons.lesson15102021.streamApi;

import java.util.stream.Stream;

public class StreamGenerators {

    public static void main(String[] args) {
        Stream<Object> empty = Stream.empty();

        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<Integer> integerStream1 = Stream.of(6, 4, 5);

        Stream<Integer> concat = Stream.concat(integerStream, integerStream1);

//        concat.forEach(System.out::println);

        Stream.Builder<Object> builder = Stream.builder();
        builder.add(1).add(4).add(67);

        builder.accept(43);
        builder.accept(58);
        builder.accept(897);

        Stream<Object> build = builder.build();

        build.forEach(System.out::println);
    }
}
