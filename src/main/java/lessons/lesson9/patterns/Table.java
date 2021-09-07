package lessons.lesson9.patterns;

public class Table {

}

class CircleTable extends Table {

  private double radius;

  public CircleTable(int r) {
    radius = r;
  }

  public double getRadius() {
    return radius;
  }
}

class SquareTable extends Table {

  private double side;

  public SquareTable(int s) {
    side = s;
  }

  public double getSide() {
    return side;
  }
}
