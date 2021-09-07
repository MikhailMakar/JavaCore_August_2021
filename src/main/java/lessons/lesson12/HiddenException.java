package lessons.lesson12;

public class HiddenException extends Exception {

  private Exception _hidden;

  public HiddenException(String er) {
    super(er);
  }

  public HiddenException(String er, Exception e) {
    super(er);
    _hidden = e;
  }

  public Exception getHiddenException() {
    return _hidden;
  }
}

