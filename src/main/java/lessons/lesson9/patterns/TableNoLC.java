package lessons.lesson9.patterns;

public class TableNoLC {

  private Table[] tables;

  public void out() {
    System.out.println("+———-+———–+———+\n|  Type    | parameter |  value  |\n+———-+———–+———+\n");

    for (int i = 0; i < tables.length; i++) {
      if (tables[i] instanceof CircleTable) {
        System.out.printf("|  Circle  |  radius   |  %5.2f  |\n",
            ((CircleTable) tables[i]).getRadius());
      } else {
        System.out.printf("|  Square  |  side     |  %5.2f  |\n",
            ((SquareTable) tables[i]).getSide());
      }
      System.out.println("+———-+———–+———+\n");
    }
  }
}
