package lessons.lesson9.lamdas;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

public class Lambda {

  public static void main(String[] args) {
    Runnable runnable = () -> {
      int a = 10;
      System.out.println("a is " + a);
      System.out.println("Runnable lambda");
      return;
    };

    Runnable runnable1 = () -> System.out.println("Some runnable task");
    Runnable methodRef = System.out::println;

    Thread thread = new Thread(runnable);
    thread.start();

    ActionListener actionListener = actionEvent -> System.out
        .println("Event happened " + actionEvent.getActionCommand());

    BinaryOperator<Long> longBinaryOperator = (x, y) -> x + y;

    final Long apply = longBinaryOperator.apply(2L, 3L);
    System.out.println(apply);

//    BiFunction<Number, Number, String> biFunction= (Long aLong,Integer integer) ->
  }
}

