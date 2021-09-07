package lessons.lesson11.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class TryCatchEx {


  public static void main(String[] args) {

    try {
      doSmth("file not found");
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
     catch (SQLException throwables) {
      throwables.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  private static void doSmth(String param) throws IOException, SQLException {

    if (param.equals("file not found")) {
      throw new FileNotFoundException();
    }
    if( param.equals("sql")){
      throw new SQLException();
    }
    if (param.equals("IO")) {
      throw new IOException();
    }

    else {
      throw new NullPointerException();
    }

  }
}
