package lessons.lesson9.patterns;

public class SquareTable1 extends Table {

  private int side;

  public SquareTable1(int s, int h) {
    side = s;// setting the side
  }

  public double getSquare() {
    return side * side;
  }

  public void out() {
    System.out.printf("|  Square  |" +
        +side + "| % 5.2f |\n ", side);
  }

}

