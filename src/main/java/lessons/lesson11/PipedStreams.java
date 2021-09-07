package lessons.lesson11;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreams {

  public static void main(String[] args) throws IOException {
    PipedInputStream inputStream = new PipedInputStream();
    PipedOutputStream outputStream = new PipedOutputStream();

    inputStream.connect(outputStream);
  }
}
