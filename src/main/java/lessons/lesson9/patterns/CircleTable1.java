package lessons.lesson9.patterns;

public class CircleTable1 extends AbstractTable {

  private int radius;

  public CircleTable1(int r, int h) {
    radius = r;// setting the radius
  }

  public double getSquare() {
    return radius * radius * Math.PI;
  }

  public void out() {
    System.out.printf("|  Circle  | " +
        radius + "| % 5.2f |\n" , radius);
  }

}
