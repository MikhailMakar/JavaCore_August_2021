package lessons.lesson9.patterns;

public class TableWithLC {

  private AbstractTable[] tables;

  public void out() {
    System.out.println("+———-+———–+———+\n|  Type  | parameter |  value  |\n+———-+———–+———+\n");
    for (int i = 0; i < tables.length; i++) {
      tables[i].out();
      System.out.println("+———-+———–+———+\n");
    }
  }
}

