package lessons.lesson7.enums;

public enum Direction {

  FORWARD(1.0) {
    public Direction opposite() {
      return BACKWARD;
    }
  },
  BACKWARD(2.0) {
    public Direction opposite() {
      return FORWARD;
    }
  };
  private double ratio;

  Direction(double r) {
    ratio = r;
  }

  public double getRatio() {
    return ratio;
  }

  public static Direction byRatio(double r) {
    if (r == 1.0) {
      return FORWARD;
    } else if (r == 2.0) {
      return BACKWARD;
    } else {
      throw new IllegalArgumentException();
    }
  }
}

enum Faculty {
  MMF, FPMI, GEO
}
